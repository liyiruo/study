package com.线程.多线程核心技术._4.mustUseMoreCondition_Error;

/**
 * @Classname ThreadA
 * @Description ThreadA
 * @Date 2020/10/10 13:26
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
        service.awaitA();
    }
}
