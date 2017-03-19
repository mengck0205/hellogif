package com.thread;

/**
 * Created by hasee on 2017/2/28.
 */
public class MyRunnable implements  Runnable{

    public  MyRunnable(){
    }
    @Override
    public void run() {
        System.out.println("子线程ID："+Thread.currentThread().getId());
    }
}
