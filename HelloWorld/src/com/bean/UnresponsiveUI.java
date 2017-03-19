package com.bean;

import java.io.IOException;

/**
 * Created by hasee on 2017/3/4.
 */
public class UnresponsiveUI {
    private volatile double d =1;
    public UnresponsiveUI() throws IOException {
        while (d>0){
            d = d + (Math.PI + Math.E)/d ;
        }
        System.in.read();
    }
}
