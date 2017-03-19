package com.factory;

import java.util.concurrent.ThreadFactory;

/**
 * Created by hasee on 2017/3/4.
 */
public class DaemonThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}
