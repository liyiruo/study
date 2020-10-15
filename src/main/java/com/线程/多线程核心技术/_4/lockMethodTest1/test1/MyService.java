package com.线程.多线程核心技术._4.lockMethodTest1.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/12 22:43
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock(true);

    public void testMethod1() {
        System.out.println("A " + lock.getHoldCount());
        lock.lock();
        try {
            System.out.println("B " + lock.getHoldCount());
            testMethod2();
            System.out.println("F " + lock.getHoldCount());
        } finally {
            lock.unlock();
            System.out.println("G " + lock.getHoldCount());
        }
    }

    public void testMethod2() {
        System.out.println("C " + lock.getHoldCount());
        lock.lock();
        try {
            System.out.println("D " + lock.getHoldCount());
        } finally {
            lock.unlock();
            System.out.println("E " + lock.getHoldCount());
        }
    }
}
