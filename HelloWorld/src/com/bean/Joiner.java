package com.bean;

/**
 * Created by hasee on 2017/3/4.
 */
public class Joiner extends Thread{
    private Sleeper sleeper;
    public Joiner(String name,Sleeper sleeper){
        super(name);
        this.sleeper = sleeper;
    }
    public void run(){
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }finally {
            System.out.println("finish");
        }
    }
}
