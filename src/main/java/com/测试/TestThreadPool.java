package com.测试;

import java.util.concurrent.*;

/**
 * @author liyiruo
 */
public class TestThreadPool {
    public static void main(String[] args) {
        //四种创建线程池的方式
        Executor executor=Executors.newCachedThreadPool();
        Executor executor1 = Executors.newFixedThreadPool(10);
        Executor executor2 = Executors.newSingleThreadExecutor();
        Executor executor3 = Executors.newScheduledThreadPool(10);
        //ExecutorService 是Executor的子类
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> submit = executorService.submit(new TestCallable());
        try {
            System.out.println(submit.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        //全参数的线程池
        TimeUnit unit = TimeUnit.MICROSECONDS;
        BlockingQueue workQueue = null;
        ThreadPoolExecutor executor4=new ThreadPoolExecutor(10, 50, 100, unit, workQueue);


    }
}
