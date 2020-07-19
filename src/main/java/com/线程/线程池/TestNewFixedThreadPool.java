package com.线程.线程池;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * 创建固定数量的线程池
 * @author liyiruo
 */
public class TestNewFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":" + index);
            });
        }
        fixedThreadPool.shutdown();
    }
}
