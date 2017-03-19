package com.thread;

/**
 * Created by hasee on 2017/2/28.
 */
public class ClientThread {
    public static void main(String[] args){
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        Mythread mythread = new Mythread("thread1");
        mythread.run();

        System.out.println("当前线程ID:"+Thread.currentThread().getId());

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();
    }
}
