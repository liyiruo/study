package com.线程.book_java多线程与socket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/19 17:00
 */
public class C1_4_4 {
    public static void main(String[] args) throws InterruptedException {
        //
        ExecutorService es=Executors.newCachedThreadPool();
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
           es.execute(new Runnable() {
               @Override
               public void run() {
                   int i=0;
                   while (!Thread.interrupted()&&i<Integer.MAX_VALUE) {
                       i++;
                   }
               }
           });
        }
        es.shutdown();
//        es.shutdownNow();
        es.awaitTermination(10L, TimeUnit.SECONDS);
        System.out.println(System.currentTimeMillis() - 1);
    }
}
