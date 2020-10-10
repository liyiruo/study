package com.线程.多线程核心技术._4.reentranLockTest;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2020/10/10 09:42
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
