package com.thread;

/**
 * Created by hasee on 2017/2/28.
 */
public class ThreadSynchronized implements Runnable{

    public int cash = 100;

    public synchronized void m() {
        System.out.println("m查看账户,余额为"+cash);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cash = cash - 100;
        System.out.println("cash1 = " + cash);
    }

    @Override
    public synchronized void run() {
        System.out.println("run查看账户，余额为"+cash);
        cash += 1000;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cash2 = " + cash);
    }

    public static void main(String[] args) {

        ThreadSynchronized test = new ThreadSynchronized();
        Thread thread = new Thread(test);
        thread.start();
        test.m();

    }
}
