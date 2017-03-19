package com.thread;

import com.bean.IntGenerator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hasee on 2017/3/4.
 */
public class EeveChecker implements Runnable{
    private IntGenerator intGenerator;
    private final int id;

    public EeveChecker(int id,IntGenerator intGenerator) {
        this.id = id;
        this.intGenerator = intGenerator;
    }

    @Override
    public void run() {

        while (!intGenerator.isCanceled()){
            int id = intGenerator.next();
            if(id%2!=0){
                System.out.println(id + "not even");
                intGenerator.cancel();
            }
        }

    }
    public static void  test(IntGenerator intGenerator,int count){
        System.out.println("press Control - c to exit");
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            service.execute(new EeveChecker(i,intGenerator));
        }
        service.shutdown();
    }
    public static void test(IntGenerator intGenerator){
        test(intGenerator,10);
    }
}
