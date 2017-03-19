package com.thread;

import com.bean.UnresponsiveUI;

import java.io.IOException;

/**
 * Created by hasee on 2017/3/4.
 */
public class ResponsiveUI extends Thread{
    private static volatile double d =1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }
    public void run(){
        while (true){
            d = d+(Math.PI + Math.E)/d ;
        }
    }


    public static void main(String[] args) throws IOException {
//        new UnresponsiveUI();
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
