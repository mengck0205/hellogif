package com.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by hasee on 2017/3/2.
 */
public class ThreadScopeShareData {
    /**
     * 线程变量获取和更新
     * @param args
     */
//    map实现
//    private static Map<Thread,Integer> dataMap = new HashMap<Thread,Integer>();
      private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    public static void main(String[] args) {

        for (int i = 0; i <2 ; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    int data = new Random().nextInt();
                    System.out.println(Thread.currentThread().getName()+"has put data"+data);
//                    dataMap.put(Thread.currentThread(),data);
                    threadLocal.set(data);
                    new A().get();
                    new B().get();
                }
            }).start();
        }
    }
    static class A{
        public void get(){
//          int data = dataMap.get(Thread.currentThread());
            int data = threadLocal.get();
            System.out.println("A from " + Thread.currentThread().getName()
                    + " get data :" + data);
        }
    }

    static class B{
        public void get(){
//            int data = dataMap.get(Thread.currentThread());
            int data = threadLocal.get();
            System.out.println("B from " + Thread.currentThread().getName()
                    + " get data :" + data);
        }
    }
}
