package com.java_base.thread.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketLOCK implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
                //获取当前线程的名称
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"_正在卖："+"第"+(ticket--)+"张票");
                }

            lock.unlock();

        }
    }

    /**
     * 卖出的票会有负的。
     * @param args
     */
    public static void main(String[] args) {
        TicketLOCK ticket = new TicketLOCK();
        Thread thread1 = new Thread(ticket, "线程一");
        Thread thread2 = new Thread(ticket, "线程二");
        Thread thread3 = new Thread(ticket, "线程三");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
