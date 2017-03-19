package com.thread;

import java.util.Random;

/**
 * Created by hasee on 2017/3/2.
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int data = new Random().nextInt();
                    System.out.println(Thread.currentThread().getName() + "pru a data" + data);
                    MyThreadScopeData.getInstance().setAge(String.valueOf(data));
                    MyThreadScopeData.getInstance().setName("name is " + String.valueOf(data));
                    new A().get();
                    new B().get();
                }
            }).start();
        }
    }

    static class A {
        public void get() {
            MyThreadScopeData myThreadScopeData = MyThreadScopeData.getInstance();
            System.out.println("A from " + Thread.currentThread().getName() +
                    "getMyData ：" + myThreadScopeData.getName() + "," + myThreadScopeData.getAge());
        }
    }

    static class B {
        public void get() {
            MyThreadScopeData myThreadScopeData = MyThreadScopeData.getInstance();
            System.out.println("B from " + Thread.currentThread().getName() +
                    "getMyData" + myThreadScopeData.getName() + "," + myThreadScopeData.getAge());
        }

    }
}

/**
 * 单例模式
 */
class MyThreadScopeData{

        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        private MyThreadScopeData(){

        }
        private static MyThreadScopeData instance = null;

        private static ThreadLocal<MyThreadScopeData> map = new ThreadLocal<>();

        public static MyThreadScopeData getInstance(){
            MyThreadScopeData instance = map.get();

            if(instance ==null){
                instance = new MyThreadScopeData();
                map.set(instance);
            }
            return instance;
        }
}

