package com.线程.线程创建和安全.线程创建;

/**
 * 创建线程
 * @author liyiruo
 */
public class NoNameInnerClassThread {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+" "+ i);
                }
            }
        };
        runnable.run();
    }
}
