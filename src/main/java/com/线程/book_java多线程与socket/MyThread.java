package com.线程.book_java多线程与socket;

/**
 * @author liyiruo
 * @Description 当run方法执行完毕并返回时，当前线程将终止
 * @Date 2020/10/19 16:53
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
