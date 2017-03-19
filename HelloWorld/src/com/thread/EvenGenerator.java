package com.thread;

import com.bean.IntGenerator;

/**
 * Created by hasee on 2017/3/5.
 */
public class EvenGenerator extends IntGenerator{
    private int currentEvenValue = 0;
    @Override
    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EeveChecker.test(new EvenGenerator());
    }
}
