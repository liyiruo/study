package com.线程.多线程核心技术._2.synchronizedMethodLockObject;

/**
 * @Classname ThreadA
 * @Description TODO
 * @Date 2020/10/10 00:03
 * @Created by liyiruo
 */
public class ThreadA extends Thread {
    private MyObject object;

    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
