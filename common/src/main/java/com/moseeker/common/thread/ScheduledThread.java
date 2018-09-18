package com.moseeker.common.thread;

import java.util.concurrent.*;

/**
 * Created by zztaiwll on 18/9/17.
 */
public enum ScheduledThread {
    Instance;
    ScheduledExecutorService executorService;
    private ScheduledThread(){
        init();
    }
    private void init() {
        executorService=Executors.newScheduledThreadPool(20);
    }
    public void close() {
        synchronized (executorService) {
            if(executorService != null) {
                this.executorService.shutdown();
            }
        }
    }
    public <T> Future<T> startTast(Runnable task, int time) {
        if(executorService == null) {
            synchronized (this) {
                init();
            }
        }
        return (Future<T>) this.executorService.schedule(task,time,TimeUnit.MILLISECONDS);
    }
}
