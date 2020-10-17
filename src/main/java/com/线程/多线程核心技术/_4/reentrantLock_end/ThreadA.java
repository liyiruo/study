package com.线程.多线程核心技术._4.reentrantLock_end;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/18 00:05
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod1();
    }
}
