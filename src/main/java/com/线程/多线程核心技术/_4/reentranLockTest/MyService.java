package com.线程.多线程核心技术._4.reentranLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname MyService
 * @Description lock 使用 ReentrantLock实现同步
 * @Date 2020/10/10 09:38
 * @Created by liyiruo
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void testMethod() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
        }
        lock.unlock();
    }
}
