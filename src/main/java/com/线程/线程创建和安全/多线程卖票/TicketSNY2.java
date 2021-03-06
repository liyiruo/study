package com.线程.线程创建和安全.多线程卖票;

/**
 * @author liyiruo
 */
public class TicketSNY2 implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            saleTicket();
        }
    }
    public synchronized void saleTicket() {
        //获取当前线程的名称
        if (ticket > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + "_正在卖：" + "第" + (ticket--) + "张票");
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        TicketSNY2 ticket = new TicketSNY2();
        Thread thread1 = new Thread(ticket, "线程一");
        Thread thread2 = new Thread(ticket, "线程二");
        Thread thread3 = new Thread(ticket, "线程三");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
