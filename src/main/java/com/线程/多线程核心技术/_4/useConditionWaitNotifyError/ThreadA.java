package com.线程.多线程核心技术._4.useConditionWaitNotifyError;

/**
 * @Classname ThreadA
 * @Description
 * @Date 2020/10/10 10:19
 * @Created by liyiruo
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
