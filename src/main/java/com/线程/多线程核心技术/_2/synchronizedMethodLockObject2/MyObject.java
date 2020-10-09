package com.线程.多线程核心技术._2.synchronizedMethodLockObject2;

/**
 * @Classname MyObject
 * @Description TODO
 * @Date 2020/10/10 00:01
 * @Created by liyiruo
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("aaa==>begin methodA threadName=:" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("aaaa==>end endTime=:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*synchronized*/ public void methodB() {
        try {
            System.out.println("begin methodb threadName=:" + Thread.currentThread().getName() + "BB==>begin time=:" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("BB=>end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
