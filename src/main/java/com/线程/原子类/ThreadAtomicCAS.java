package com.线程.原子类;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 使用原子类，AtomicInteger 就不会出现这样的问题了。
 * CAS的原理
 * @author liyiruo
 */
public class ThreadAtomicCAS {
    private static AtomicInteger integer ;
    public static void main(String[] args) {
        int j = 0;
        while (j < 100) {
            integer=new AtomicInteger(0);
            j++;

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        integer.getAndIncrement();
                    }
                }
            });


            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        integer.getAndIncrement();
                    }
                }
            });


            thread1.start();
            thread2.start();
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("n的最终值为：" + integer.get());
        }
    }
}
