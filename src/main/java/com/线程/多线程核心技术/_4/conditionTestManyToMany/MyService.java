package com.线程.多线程核心技术._4.conditionTestManyToMany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname MyService
 * @Description TODO
 * @Date 2020/10/10 18:18
 * @Created by liyiruo
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() {
        lock.lock();
        try {
            if (hasValue == true) {
                System.out.println("有可能连续输出❤️❤️");
                condition.await();
            }
            System.out.println("打印❤️");
            hasValue = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void get() {
        lock.lock();
        try {
            if (hasValue == false) {
                System.out.println("有可能连续输出⭐️⭐️");
                condition.await();
            }
            System.out.println("打印⭐️");
            hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
