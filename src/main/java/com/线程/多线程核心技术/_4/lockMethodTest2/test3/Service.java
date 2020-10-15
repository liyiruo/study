package com.线程.多线程核心技术._4.lockMethodTest2.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/15 11:10
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void waitMethod() {
        lock.lock();
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notityMethod() {
        lock.lock();
        try {
            System.out.println("有没有线程正在等待newCondition? " + lock.hasWaiters(condition) + " 线程数是多少？ " + lock.getWaitQueueLength(condition));
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
