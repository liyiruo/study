package com.线程.book_java多线程与socket;

/**
 * @author liyiruo
 * @Description 实现借口。调用方法。
 * @Date 2020/10/19 16:57
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        //……
    }

    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}
