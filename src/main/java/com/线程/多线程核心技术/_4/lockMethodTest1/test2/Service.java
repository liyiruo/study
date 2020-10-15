package com.线程.多线程核心技术._4.lockMethodTest1.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/13 15:32
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1() {
        lock.lock();
        try {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "进入方法！");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
