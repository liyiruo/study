package com.线程.多线程核心技术._4.conditionTestMoreMethod;

/**
 * @Classname ThreadB
 * @Description TODO
 * @Date 2020/10/10 09:56
 * @Created by liyiruo
 */
public class ThreadBB extends Thread{
    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
