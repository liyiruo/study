package com.线程.多线程核心技术._4.mustUseMoreCondition_Error;

/**
 * @Classname ThreadB
 * @Description ThreadB
 * @Date 2020/10/10 13:27
 * @Created by liyiruo
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
