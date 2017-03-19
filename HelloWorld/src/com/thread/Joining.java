package com.thread;

import com.bean.Joiner;
import com.bean.Sleeper;

/**
 * Created by hasee on 2017/3/4.
 */
public class Joining {
    public static void main(String[] args) {
        Sleeper sleeper = new Sleeper("sleepy",1500);
        Sleeper grumpy = new Sleeper("grumpy",1500);

        Joiner dopey = new Joiner("Dopey",sleeper);
        Joiner doc = new Joiner("doc",grumpy);

        grumpy.interrupt();
    }
}
