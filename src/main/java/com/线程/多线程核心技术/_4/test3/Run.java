package com.线程.多线程核心技术._4.test3;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/13 23:37
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = () -> {
            service.waitMethod();
        };

        //创建10个线程
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        //启动线程
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(2000);
        service.notifyMethod();
    }
}
