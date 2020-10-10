package com.线程.多线程核心技术._4.mustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname MyService
 * @Description
 * @Date 2020/10/10 13:17
 * @Created by liyiruo
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void awaitA() {
        lock.lock();
        try {
            System.out.println("begin awaitA 时间为" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            condition.await();
            System.out.println(" end awaitA 时间为" + System.currentTimeMillis() + " ThreadName " + Thread.currentThread().getName());
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
            condition.await();
            System.out.println(" end awaitB 时间为" + System.currentTimeMillis() + " ThreadName " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll() {
        lock.lock();
        try {
            System.out.println("  signalAll时间为" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
