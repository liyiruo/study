package com.线程.多线程核心技术._2.synchronizedMethodLockObject;

import com.线程.多线程核心技术._2.twoObjectTwoLock.ThreadA;

/**
 * @Classname MyObject
 * @Description TODO
 * @Date 2020/10/10 00:01
 * @Created by liyiruo
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
