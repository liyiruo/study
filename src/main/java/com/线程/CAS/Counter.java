package com.线程.CAS;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liyiruo
 * @Classname Counter
 * @Description 使用循环cas实现原子操作
 * cas 的 三大问题：
 * 1。ABA问题
 * 2。循环时间长开销大
 * 3。只能保证一个共享变量的原子操作（可以把多个变量合并成一个）
 * @Date 2020/9/29 17:39
 * @Created by liyiruo
 */
public class Counter {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int i = 0;

    public static void main(String[] args) {
        final Counter cas = new Counter();
        List<Thread> ts = new ArrayList<>(600);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    cas.count();
                    cas.safeCount();
                }
            });
            ts.add(t);
        }
        for (Thread t :
                ts) {
            t.start();
        }
        for (Thread t :
                ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //非线程安全的计数方式
        System.out.println(cas.i);
        //cas线程安全的计数方式
        System.out.println(cas.atomicInteger.get());
        // 消耗的时间
        System.out.println(System.currentTimeMillis() - start);
    }

    /**
     * 线程安全的计数器
     */
    private void safeCount() {
        for (; ; ) {
            int i = atomicInteger.get();
            boolean suc = atomicInteger.compareAndSet(i, ++i);
            if (suc) {
                break;
            }
        }
    }

    /**
     * 非线程安全的计数器
     */
    private void count() {
        i++;
    }
}
