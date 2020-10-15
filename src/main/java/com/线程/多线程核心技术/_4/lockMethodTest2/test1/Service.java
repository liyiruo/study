package com.线程.多线程核心技术._4.lockMethodTest2.test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/15 10:40
 */
public class Service {
    public ReentrantLock lock=new ReentrantLock();
    public Condition condition=lock.newCondition();
    public void waitMethod(){
        lock.lock();
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
