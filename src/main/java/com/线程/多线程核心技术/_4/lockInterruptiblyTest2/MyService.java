package com.线程.多线程核心技术._4.lockInterruptiblyTest2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/16 00:29
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void testMethod() {

        try {
            lock.lockInterruptibly();
            System.out.println(" begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
                //为了不让currentThread()过高占用cup资源
                //所以执行yield()方法
                Thread.yield();
            }
            System.out.println(" end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
