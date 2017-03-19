package com.thread;

/**
 * Created by hasee on 2017/2/28.
 */
public class Mythread extends  Thread {
    private  String name;

    public Mythread(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("name:"+name+",子线程ID:"+Thread.currentThread().getId());
    }
}
