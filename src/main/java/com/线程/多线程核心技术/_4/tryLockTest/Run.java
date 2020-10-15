package com.线程.多线程核心技术._4.tryLockTest;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/16 01:40
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        Runnable runnable = () -> {
            service.waitMethod();
        };

        Thread a=new Thread(runnable);
        a.setName("A");
        a.start();

        Thread b=new Thread(runnable);
        b.setName("B");
        b.start();
    }
}
