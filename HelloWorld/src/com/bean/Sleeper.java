package com.bean;

/**
 * Created by hasee on 2017/3/4.
 */
public class Sleeper extends Thread{
    private int duration;
    public Sleeper(String name ,int sleepTime){
        super(name);
        duration = sleepTime;
        start();
    }
    public void run(){
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() +"was interrupted ."+"isInterrupted:" +isInterrupted());
            return;
        }
        System.out.println(getName() + "has awakened");
    }
}
