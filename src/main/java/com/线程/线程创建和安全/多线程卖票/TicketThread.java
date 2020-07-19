package com.线程.线程创建和安全.多线程卖票;

/**
 * 普通的卖票程序 不安全的 用Thread 调用
 *
 * @author liyiruo
 */
public class TicketThread implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                //获取当前线程的名称
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "_正在卖：" + "第" + (ticket--) + "张票");
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Runnable target = new TicketThread();
        Thread thread1 = new Thread(target);
        Thread thread2 = new Thread(target);
        Thread thread3 = new Thread(target);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
