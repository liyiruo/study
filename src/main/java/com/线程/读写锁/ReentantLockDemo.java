package com.线程.读写锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁,多次加锁和解锁，加锁次数不能多于解锁次数
 * @author liyiruo
 */
public class ReentantLockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(false);
//        加锁10次
        for (int i = 0; i < 11; i++) {
            lock.lock();
            System.out.println("加锁==>"+(i+1));
        }

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("解锁==>"+(i+1));
            } finally {
                lock.unlock();
            }
        }
    }
}
