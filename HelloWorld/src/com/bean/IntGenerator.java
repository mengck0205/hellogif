package com.bean;

/**
 * Created by hasee on 2017/3/4.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){
        this.canceled = true;
    }
    public boolean isCanceled(){
        return this.canceled;
    }
}
