package com.线程.多线程核心技术._4.condition123;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 03:05
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
