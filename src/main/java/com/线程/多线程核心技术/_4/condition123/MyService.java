package com.线程.多线程核心技术._4.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 02:59
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    volatile private int nextWhoPrint = 1;

    public void testMethod() {
        lock.lock();
        try {
            while (nextWhoPrint != 1) {
                condition.await();
            }
            System.out.println("AAA");
            nextWhoPrint = 2;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    public void testMethod2() {
        lock.lock();
        try {
            while (nextWhoPrint != 2) {
                condition.await();
            }
            System.out.println("   BBB");
            nextWhoPrint = 3;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void testMethod3() {
        lock.lock();
        try {
            while (nextWhoPrint != 3) {
                condition.await();
            }
            System.out.println("   CCC");
            nextWhoPrint = 1;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
