package com.线程.多线程核心技术._4.lockMethodTest1.test2;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/13 15:36
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        final int num=8;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < num; i++) {
            threadArray[i]=new Thread(runnable);
        }
        for (int i = 0; i < num; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁");
    }
}
