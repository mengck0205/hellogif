package com.Callable;

import com.bean.TaskWithResult;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by hasee on 2017/3/4.
 */
public class CallAbleTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<String>> futures = new ArrayList<Future<String>>();
        for (int i = 0; i < 5; i++) {
            futures.add(service.submit(new TaskWithResult(i)));
        }
        for (Future<String> future : futures){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                service.shutdown();
            }
        }
    }
}
