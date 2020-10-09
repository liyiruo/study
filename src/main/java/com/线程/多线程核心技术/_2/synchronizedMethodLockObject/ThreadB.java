package com.线程.多线程核心技术._2.synchronizedMethodLockObject;

/**
 * @Classname ThreadB
 * @Description TODO
 * @Date 2020/10/10 00:05
 * @Created by liyiruo
 */
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
