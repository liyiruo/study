package com.线程.多线程核心技术._4.conditionTestMoreMethod;

/**
 * @Classname ThreadA
 * @Description TODO
 * @Date 2020/10/10 09:55
 * @Created by liyiruo
 */
public class ThreadAA extends Thread {
    private MyService service;

    public ThreadAA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
