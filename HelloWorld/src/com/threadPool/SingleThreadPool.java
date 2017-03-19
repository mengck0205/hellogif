package com.threadPool;

import com.bean.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hasee on 2017/3/4.
 */
public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 4; i++) {
            service.execute(new LiftOff());
        }
        service.shutdown();
    }
}
