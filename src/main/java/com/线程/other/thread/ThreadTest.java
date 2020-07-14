package com.线程.other.thread;

public class ThreadTest {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.inc();
                }
            }).start();
        }

        System.out.println("counter=====>" + counter.count);
    }
}
