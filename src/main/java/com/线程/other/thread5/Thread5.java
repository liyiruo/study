package com.线程.other.thread5;

public class Thread5 implements Runnable {

    private int ticket =100;
    @Override
    public void run() {

        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName()+":"+ticket--);
        }
    }


    public static void main(String[] args) {
        Thread5 thread5 = new Thread5();
        new Thread(thread5).start();
        new Thread(thread5).start();
        new Thread(thread5).start();

    }
}
