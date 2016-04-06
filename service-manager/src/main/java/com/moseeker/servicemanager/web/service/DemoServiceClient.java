package com.moseeker.servicemanager.web.service;

import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import com.moseeker.thrift.gen.demo.EchoService.Iface;

/**
 * Created by zzh on 16/3/30.
 */
@Service
public class DemoServiceClient extends BaseService<Iface> {

    public static final String DEMO_SERVICE_NAME = "com.moseeker.thrift.service$EchoService";

    Iface service = getService(DEMO_SERVICE_NAME, Iface.class.getName());

    public String echo(String msg) throws TException {
        return service.echo(msg);
    }

}
