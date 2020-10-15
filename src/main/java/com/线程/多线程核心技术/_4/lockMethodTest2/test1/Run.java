package com.线程.多线程核心技术._4.lockMethodTest2.test1;

/**
 * @author liyiruo
 * @Description  查询指定的线程是否正在等待获取此锁，也就是判断参数中的线程是否在等待队列中。
 * @Date 2020/10/15 10:43
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = () -> {
            service.waitMethod();
        };
        //获取到锁
        Thread a = new Thread(runnable);
        a.start();

        Thread.sleep(500);
        //未获取到锁
        Thread b=new Thread(runnable);
        b.start();

        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(a));
        System.out.println(service.lock.hasQueuedThread(b));

    }
}
