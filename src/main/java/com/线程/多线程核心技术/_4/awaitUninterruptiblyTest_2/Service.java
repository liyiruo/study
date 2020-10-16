package com.线程.多线程核心技术._4.awaitUninterruptiblyTest_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 02:39
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod() {
        lock.lock();
        try {
            System.out.println("wait begin");
//            condition.await();
            condition.awaitUninterruptibly();
            System.out.println(" wait end");
        } finally {
            lock.unlock();
        }
    }
}
