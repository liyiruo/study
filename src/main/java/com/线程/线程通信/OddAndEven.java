package com.线程.线程通信;

/**
 * 线程之间是如何通信的
 *
 * @author liyiruo
 */
public class OddAndEven {
    private int num = 0;
    private Object object = new Object();

    /**
     * 1.判断i是否小于10
     * 2.如是偶数打印，打印完调就唤醒另外一个线程
     * 3。如果是基数,就等待
     */
    public void odd() {
        while (num < 10) {
            synchronized (object) {
                if (num % 2 == 1) {
                    System.out.println(Thread.currentThread().getName() + "===>" + num);
                    num++;
                    object.notify();
                } else {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }

    }

    public void even() {
        while (num < 10) {
            synchronized (object) {
                if (num % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + "===>" + num);
                    num++;
                    object.notify();
                } else {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        final OddAndEven oddAndEven = new OddAndEven();
        //开启基数线程
        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                oddAndEven.odd();
            }
        }, "奇数111");
        odd.start();
        //开启偶数线程
        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                oddAndEven.even();
            }
        }, "偶数000");
        even.start();
    }
}
