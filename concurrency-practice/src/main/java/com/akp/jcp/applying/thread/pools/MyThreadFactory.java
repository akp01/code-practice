package com.akp.jcp.applying.thread.pools;

import java.util.concurrent.*;

/**
 * MyThreadFactory
 * <p/>
 * Custom thread factory
 *
 * 
 */
public class MyThreadFactory implements ThreadFactory {
    private final String poolName;

    public MyThreadFactory(String poolName) {
        this.poolName = poolName;
    }

    public Thread newThread(Runnable runnable) {
        return new MyAppThread(runnable, poolName);
    }
}
