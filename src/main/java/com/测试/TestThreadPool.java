package com.测试;

import java.util.concurrent.*;

/**
 * @author liyiruo
 */
public class TestThreadPool {
    public static void main(String[] args) {
        Executor executor=Executors.newCachedThreadPool();
        Executor executor1 = Executors.newFixedThreadPool(10);
        Executor executor2 = Executors.newSingleThreadExecutor();
        Executor executor3 = Executors.newScheduledThreadPool(10);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> submit = executorService.submit(new TestCallable());
        try {
            System.out.println(submit.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
