package com.线程.多线程核心技术._2.synLockIn2;

/**
 * @Classname MyThread
 * @Description
 * @Date 2020/10/10 01:49
 * @Created by liyiruo
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateIMainMethod();
    }
}
