package com.线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建单一的线程
 * @author liyiruo
 */
public class TestNewSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(() -> {
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + ":" + index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
