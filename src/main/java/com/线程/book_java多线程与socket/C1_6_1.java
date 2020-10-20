package com.线程.book_java多线程与socket;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/20 11:36
 */
public class C1_6_1 implements Runnable{
    public static final Set<Integer> data=new HashSet<>();
    public static int count;
    protected int page;

    public C1_6_1(int page) {
        this.page = page;
    }

    @Override
    public void run() {
        int v=page*10000;
        for (int i = 0; i < 10000; i++) {
            data.add(i);
            count++;
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ExecutorService es=Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            es.execute(new C1_6_1(i));
        }
        es.shutdown();

        try {
            es.awaitTermination(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("size="+data.size());
        System.out.println("count="+count);
    }
}
