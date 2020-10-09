package com.线程.多线程核心技术._2.synLockIn_1;

/**
 * @Classname MyTest
 * @Description
 * @Date 2020/10/10 01:13
 * @Created by liyiruo
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
