package com.线程.多线程核心技术._4.lockMethodTest3.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/15 23:51
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod() {
        System.out.println(Thread.currentThread().getName() + " " + lock.isHeldByCurrentThread());
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " " + lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}
