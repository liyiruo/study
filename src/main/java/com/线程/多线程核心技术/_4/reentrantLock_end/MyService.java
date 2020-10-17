package com.线程.多线程核心技术._4.reentrantLock_end;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/18 00:02
 */
public class MyService {
    private ReentrantLock lock=new ReentrantLock();
    private String username = "abc";

    public void testMethod1() {
        lock.lock();
        try {
            System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            System.out.println("print service " + username);
            Thread.sleep(4000);
            System.out.println(" end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
