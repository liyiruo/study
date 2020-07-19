package com.线程.线程创建和安全.多线程卖票;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 这种可能会出现0 和负的值，是一种不安全的线程
 *
 * @author liyiruo
 */
public class TicketPool implements Runnable {
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

    /**
     * 卖出的票会有负的。
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        TicketPool ticket = new TicketPool();
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(ticket);
        service.submit(ticket);
        service.submit(ticket);

    }
}
