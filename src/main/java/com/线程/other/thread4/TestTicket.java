package com.线程.other.thread4;

/**
 * @author liyiruo
 */
public class TestTicket extends Thread {
    private  static int ticket=10;
    private Object object = new Object();
    @Override
    public  void run() {

        synchronized (object) {
            while(ticket>0) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName()+"tickct====>"+ticket--);
                }
                object.notify();
            }
        }
    }
    public static void main(String[] args) {
        new TestTicket().start();
        new TestTicket().start();
    }
}
