package com.线程.多线程核心技术._4.tryLock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/16 01:56
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("   " + Thread.currentThread().getName() + "获取锁的时间：" + System.currentTimeMillis());
                Thread.sleep(10000);//todo 等待时间
            } else {
                System.out.println("    " + Thread.currentThread().getName() + " 没有获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
