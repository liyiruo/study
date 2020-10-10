package com.线程.多线程核心技术._4.useConditionWaitNotifyOk;

/**
 * @Classname Run
 * @Description
 * @Date 2020/10/10 10:45
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyServer server = new MyServer();
        ThreadA a = new ThreadA(server);
        a.start();
        Thread.sleep(3000);
        server.signal();
    }

}
