package com.线程.多线程核心技术._4._309;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname Test
 * @Description  永远都不回输出await end
 * @Date 2020/10/10 11:19
 * @Created by liyiruo
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        //是公平锁吗
        Lock lock = new ReentrantLock(true);
        lock.lock();
        Condition condition = lock.newCondition();
        System.out.println("await begin");
        condition.await();
        System.out.println("await end");
    }
}
