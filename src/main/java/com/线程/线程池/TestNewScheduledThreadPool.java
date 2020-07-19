package com.线程.线程池;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 定时执行的线程
 * @author liyiruo
 */
public class TestNewScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool
                = Executors.newScheduledThreadPool(3);
        System.out.println("开始："+System.currentTimeMillis());
        for (int i = 0; i < 4; i++) {
            final int index = i;
            scheduledThreadPool.schedule(() -> {
                System.out.println(Thread.currentThread().getName() + ":" + System.currentTimeMillis() + "==>" + index);
            }, 2L, TimeUnit.SECONDS);
        }
        scheduledThreadPool.shutdown();
    }
}
