package com.线程.多线程核心技术._4.awaitUninterruptiblyTest_1;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 02:42
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
