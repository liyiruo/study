package com.线程.多线程核心技术._4.condition123;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 03:06
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod2();
    }
}
