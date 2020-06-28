package com.测试;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTest {
    public static void main(String[] args) {
        //类加载器
        ClassLoader c = new ClassLoader();
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime===>"+nanoTime);
        Condition condition=new Condition() {
            @Override
            public void await() throws InterruptedException {
            }
            @Override
            public void awaitUninterruptibly() {
            }
            @Override
            public long awaitNanos(long nanosTimeout) throws InterruptedException {
                return 0;
            }

            @Override
            public boolean await(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }
            @Override
            public boolean awaitUntil(Date deadline) throws InterruptedException {
                return false;
            }
            @Override
            public void signal() {
            }
            @Override
            public void signalAll() {
            }
        };
        Lock lock=new ReentrantLock();
        try {
            TimeUnit.MICROSECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
