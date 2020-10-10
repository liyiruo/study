package com.线程.多线程核心技术._4.mustUseMoreCondition_Error.mustUseMoreCondition_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname MyService
 * @Description
 * @Date 2020/10/10 13:35
 * @Created by liyiruo
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();

    public void awaitA() {
        lock.lock();
        try {
            System.out.println("begin awaitA时间为" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println(" end awaitA时间为" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        lock.lock();
        try {
            System.out.println("begin awaitB 时间为" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println(" end awaitB 时间为" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        lock.lock();
        try {
            System.out.println(" SignalAll_A时间为" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        lock.lock();
        try {
            System.out.println(" SignalAll_A时间为" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
