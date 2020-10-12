package com.线程.多线程核心技术._4.Fair_noFair_test;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2020/10/12 22:18
 * @Created by liyiruo
 */
public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
