package com.线程.多线程核心技术._4.conditionTestManyToMany;

/**
 * @Classname MyThreadA
 * @Description
 * @Date 2020/10/10 18:24
 * @Created by liyiruo
 */
public class MyThreadA extends Thread {
    MyService service;

    public MyThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.set();
        }
    }
}
