package com.线程.thread.threadINS;

/**
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
