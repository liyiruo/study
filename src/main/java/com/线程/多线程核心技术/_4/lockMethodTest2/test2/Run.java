package com.线程.多线程核心技术._4.lockMethodTest2.test2;

/**
 * @author liyiruo
 * @Description  等待队列中是否有等待线程
 * @Date 2020/10/15 11:00
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = () -> {
            service.waitMethod();
        };

        Thread a = new Thread(runnable);
        a.start();

        Thread.sleep(500);

        Thread b = new Thread(runnable);
        b.start();

        Thread.sleep(500);
        //指定的线程是否获得锁
        System.out.println(service.lock.hasQueuedThread(a));
        System.out.println(service.lock.hasQueuedThread(b));
        //等待队列中是否有等待线程
        System.out.println(service.lock.hasQueuedThreads());

    }
}
