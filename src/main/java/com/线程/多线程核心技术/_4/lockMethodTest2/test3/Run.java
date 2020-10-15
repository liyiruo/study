package com.线程.多线程核心技术._4.lockMethodTest2.test3;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/15 11:11
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {

        final Service service = new Service();
        Runnable runnable = () -> {
            service.waitMethod();
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(300);
        service.notityMethod();
    }
}
