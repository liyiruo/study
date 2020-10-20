package com.线程.book_java多线程与socket;

import java.util.concurrent.*;

/**
 * @author liyiruo
 * @Description  callable  Future
 * @Date 2020/10/20 11:31
 */
public class TestCallable_Future {
    public static void main(String[] args) {
        ExecutorService es=Executors.newCachedThreadPool();
        Future<String> future = es.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello world";
            }
        });

        try {
            String s=future.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
