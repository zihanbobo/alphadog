package com.moseeker.rpccenter.client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketException;

import org.apache.commons.pool.impl.GenericKeyedObjectPool;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.moseeker.rpccenter.common.ServerNode;
import com.moseeker.rpccenter.exception.RpcException;
import com.moseeker.rpccenter.loadbalance.common.DynamicHostSet;

import com.moseeker.rpccenter.loadbalance.LoadBalance;

/**
 * Created by zzh on 16/3/30.
 */
public class DefaultInvoker<T> implements Invoker {

    /** LOGGER */
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    /** {@link GenericKeyedObjectPool}<{@link ServerNode},{@link T}> */
    private final GenericKeyedObjectPool<ServerNode, T> pool;

    /** 重试次数 */
    private final int retry;

    /** client端的{@link ServerNode} */
    private final ServerNode clientNode;

    /** {@link DynamicHostSet} */
    private final DynamicHostSet hostSet;

    /**
     * @param clientNode
     * @param pool
     * @param retry
     * @param hostSet
     */
    public DefaultInvoker(ServerNode clientNode, GenericKeyedObjectPool<ServerNode, T> pool, int retry, DynamicHostSet hostSet) {
        this.clientNode = clientNode;
        this.pool = pool;
        this.retry = retry;
        this.hostSet = hostSet;
    }

    @Override
    public Object invoke(Method method, Object[] args) throws RpcException {
        T client = null;
        ServerNode serverNode = null;
        Throwable exception = null;

        for (int i = 0; i == 0 || i < retry + 1; i++) {
            try {
                serverNode = LoadBalance.nextBackend(hostSet);
                if (serverNode == null) {
                    continue;
                }
                client = pool.borrowObject(serverNode);
                Object result = method.invoke(client, args);
                return result;
            } catch (InvocationTargetException ite) {// XXX:InvocationTargetException异常发生在method.invoke()中
                Throwable cause = ite.getCause();
                if (cause != null) {
                    if (cause instanceof TTransportException) {
                        exception = cause;
                        try {
                            // XXX:这里直接清空pool,否则会出现连接慢恢复的现象
                            // 发送socket异常时，证明socket已经失效，需要重新创建
                            if (cause.getCause() != null && cause.getCause() instanceof SocketException) {
                                pool.clear(serverNode);
                            } else {
                                // XXX:其他异常的情况，需要将当前链接置为无效
                                pool.invalidateObject(serverNode, client);
                            }
                        } catch (Exception e) {
                            LOGGER.error(e.getMessage(), e);
                        }
                        client = null; // 这里是为了防止后续return回pool中
                    } else {
                        exception = cause;
                    }
                } else {
                    exception = ite;
                }
            } catch (Throwable e) {
                exception = e;
            } finally {
                if (client != null) {
                    try {
                        pool.returnObject(serverNode, client);
                    } catch (Exception e) {
                        LOGGER.error(e.getMessage(), e);
                    }
                }
            }
        }
        throw new RpcException("Invoke error!", exception);
    }
}