package com.线程.线程创建和安全.多线程卖票;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 */
public class TicketLock implements Runnable {
    private int ticket = 100;
    /**
     * 是否是公平锁
     */
    private Lock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "_正在卖：" + "第" + (ticket--) + "张票");
                } else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }

    /**
     * 卖出的票会有负的，会吗
     */
    public static void main(String[] args) {
        TicketLock ticket = new TicketLock();
        Thread thread1 = new Thread(ticket, "线程一");
        Thread thread2 = new Thread(ticket, "线程二");
        Thread thread3 = new Thread(ticket, "线程三");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
