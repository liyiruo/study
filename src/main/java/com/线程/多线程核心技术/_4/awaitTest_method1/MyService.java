package com.线程.多线程核心技术._4.awaitTest_method1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/16 02:29
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod() {
        lock.lock();
        try {
            System.out.println("begin " + System.currentTimeMillis());
            condition.await(3, TimeUnit.SECONDS);
            System.out.println("await  end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
