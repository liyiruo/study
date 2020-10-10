package com.线程.多线程核心技术._4.useConditionWaitNotifyError.z3_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname MyService
 * @Description TODO
 * @Date 2020/10/10 10:24
 * @Created by liyiruo
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        lock.lock();
        try {
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }
}
