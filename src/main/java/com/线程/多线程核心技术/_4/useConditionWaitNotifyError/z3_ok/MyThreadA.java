package com.线程.多线程核心技术._4.useConditionWaitNotifyError.z3_ok;

/**
 * @Classname MyThreadA
 * @Description TODO
 * @Date 2020/10/10 10:27
 * @Created by liyiruo
 */
public class MyThreadA extends Thread {
    private MyService service;

    public MyThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
