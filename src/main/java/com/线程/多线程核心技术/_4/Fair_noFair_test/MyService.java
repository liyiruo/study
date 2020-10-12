package com.线程.多线程核心技术._4.Fair_noFair_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname MyService
 * @Description
 * @Date 2020/10/12 22:11
 * @Created by liyiruo
 */
public class MyService {
    public Lock lock;

    public MyService(boolean fair) {
        lock = new ReentrantLock(fair);
    }

    public void testMethod() {
        lock.lock();
        try {
            System.out.println("testMethod " + Thread.currentThread().getName());
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
