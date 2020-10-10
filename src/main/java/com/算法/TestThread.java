package com.算法;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname TestThread
 * @Description 测试多线程 两个线程轮流输出 abcdef 和12345 输出结果为a1b2c3d4e5
 * @Date 2020/10/10 18:38
 * @Created by liyiruo
 */
public class TestThread {

    public static void main(String[] args) {
        TestThread t=new TestThread();
        MyThreadNU nu = new MyThreadNU(t);
        nu.start();
        MyThreadCH ch = new MyThreadCH(t);
        ch.start();
    }
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean flag = true;

    public void ch(char cha) {
        lock.lock();
        try {
            if (flag == false) {
                condition.await();
            }
            System.out.print(String.valueOf(cha));
            flag = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void nu(char cha) {
        lock.lock();
        try {
            if (flag == true) {
                condition.await();
            }
            System.out.print(String.valueOf(cha));
            flag = true;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


}

class MyThreadCH extends Thread {
    private TestThread thread;
    private final static char[] ch = "abcde".toCharArray();

    public MyThreadCH(TestThread thread) {
        super();
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < ch.length; i++) {
            thread.ch(ch[i]);
        }
    }
}

class MyThreadNU extends Thread {
    private TestThread thread;
    private final static char[] nu = "12345".toCharArray();

    public MyThreadNU(TestThread thread) {
        super();
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < nu.length; i++) {
            thread.nu(nu[i]);
        }
    }
}