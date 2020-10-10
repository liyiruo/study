package com.线程.多线程核心技术._4.useConditionWaitNotifyOk;

/**
 * @Classname ThreadA
 * @Description
 * @Date 2020/10/10 10:43
 * @Created by liyiruo
 */
public class ThreadA extends Thread {
    private MyServer server;

    public ThreadA(MyServer server) {
        super();
        this.server = server;
    }

    @Override
    public void run() {
        server.await();
    }
}
