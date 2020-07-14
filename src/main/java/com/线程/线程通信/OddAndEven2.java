package com.线程.线程通信;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程之间是如何通信的
 * 通过object 的wait  和  notify 进行唤醒
 *
 * @author liyiruo
 */
public class OddAndEven2 {
    private int num = 0;
//    private Object object = new Object();
    /**
     * 使用独占锁
     */
    private Lock lock = new ReentrantLock(false);
    private Condition condition = lock.newCondition();

    /**
     * 1.判断i是否小于10
     * 2.如是偶数打印，打印完调就唤醒另外一个线程
     * 3。如果是基数,就等待
     */
    public void odd() {
        while (num < 10) {
            lock.lock();
            try {
                if (num % 2 == 1) {
                    System.out.println(Thread.currentThread().getName() + "===>" + num);
                    num++;
                    condition.signal();
                } else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            } finally {
                lock.unlock();
            }

        }

    }

    public void even() {
        while (num < 10) {
            lock.lock();
            try {
                if (num % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + "===>" + num);
                    num++;
                    condition.signal();
                } else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        final OddAndEven2 oddAndEven = new OddAndEven2();
        //开启基数线程
        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                oddAndEven.odd();
            }
        }, "奇数111");
        odd.start();
        //开启偶数线程
        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                oddAndEven.even();
            }
        }, "偶数000");
        even.start();
    }
}
