package com.线程.多线程核心技术._4.tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/16 01:39
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " 获得锁");
        } else {
            System.out.println(Thread.currentThread().getName() + " 没有获得锁");
        }
    }
}
