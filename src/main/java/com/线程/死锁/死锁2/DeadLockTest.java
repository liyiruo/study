package com.线程.死锁.死锁2;

/**
 * 用来测试死锁的主类
 * 程序会一直这么运行下去，执行不完
 * @author liyiruo
 */
public class DeadLockTest {
    public static void main(String[] args) {
        DeadLock lock1 = new DeadLock(true);
        DeadLock lock2 = new DeadLock(false);

        Thread thread1=new Thread(lock1);
        Thread thread2=new Thread(lock2);
        thread1.start();
        thread2.start();
    }
}
