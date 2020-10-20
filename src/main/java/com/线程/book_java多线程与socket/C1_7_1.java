package com.线程.book_java多线程与socket;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author liyiruo
 * @Description  volatile
 * @Date 2020/10/20 12:17
 */
public class C1_7_1 implements Runnable{
//    public static boolean flag=true;
    public static volatile boolean flag=true;
    public static  int value;

    @Override
    public void run() {
        while (flag){
            value++;
            value--;
            System.out.println(value);
        }
        System.out.println(false);
    }


    public static void main(String[] args) throws InterruptedException {

        ExecutorService es=Executors.newCachedThreadPool();
        long l = System.currentTimeMillis();
        es.execute(new C1_7_1());
        es.execute(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(2000L);
                C1_7_1.flag = false;
            }
        });
        es.shutdown();
        es.awaitTermination(10L, TimeUnit.SECONDS);
        System.out.println(System.currentTimeMillis()-1);
    }
}
