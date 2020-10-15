package com.线程.多线程核心技术._4.lockMethodTest3.test3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/16 00:22
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod() {
        System.out.println(lock.isLocked());
        lock.lock();
        try {
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
            System.out.println(lock.isLocked());
        }
    }
}
