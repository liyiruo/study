package com.线程.原子类;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 给CAS添加时间戳，是出现的并发问题
 * @author liyiruo
 */
public class ThreadAtomicABA {
    private static AtomicStampedReference stampedReference;
    public static void main(String[] args) {
        int j = 0;
        while (j < 100) {
            stampedReference = new AtomicStampedReference(0, 0);
            j++;
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        Integer reference;
                        Integer stame;
                        do {
                             reference = (Integer) stampedReference.getReference();
                            stame=stampedReference.getStamp();
                        } while (!stampedReference.compareAndSet(reference,reference+1,stame,stame+1));
                    }
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        Integer reference;
                        Integer stame;
                        do {
                            reference = (Integer) stampedReference.getReference();
                            stame=stampedReference.getStamp();
                        } while (!stampedReference.compareAndSet(reference,reference+1,stame,stame+1));
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
            System.out.println("n的最终值为：" + stampedReference.getReference());
        }
    }
}
