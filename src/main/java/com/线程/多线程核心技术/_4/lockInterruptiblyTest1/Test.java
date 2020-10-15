package com.线程.多线程核心技术._4.lockInterruptiblyTest1;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/16 00:38
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);

        a.setName("A");
        a.start();

        Thread.sleep(500);

        ThreadA b = new ThreadA(service);
        b.setName("B");
        b.start();

        Thread.sleep(500);
        b.interrupt();
        System.out.println("main中断b，但是并未成功");
    }
}
