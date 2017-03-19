package com.bean;

import java.util.concurrent.Callable;

/**
 * Created by hasee on 2017/3/4.
 */
public class TaskWithResult implements Callable<String>{
    private  int id;

    public TaskWithResult(int id){
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        return "result: ID"+id;
    }
}
