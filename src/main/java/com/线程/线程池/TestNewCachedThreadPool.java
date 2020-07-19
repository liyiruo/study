package com.线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liyiruo
 */
public class TestNewCachedThreadPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //使用for循环创建线程，其实最终 只使用了一个线程。
        for (int i = 0; i < 10; i++) {

            final int index = i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + ":" + index);
            });
        }
        cachedThreadPool.shutdown();
    }
}
