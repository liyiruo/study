package com.线程.多线程核心技术._4.conditionTest;

/**
 * @Classname MyThreadB
 * @Description
 * @Date 2020/10/10 18:27
 * @Created by liyiruo
 */
public class MyThreadB extends Thread {
    private MyService service;

    public MyThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.get();
        }
    }
}
