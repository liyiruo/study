package com.线程.thread.线程创建;

/**
 *
 * @author liyiruo
 */
public class NoNameInnerClassThread2 {
    public static void main(String[] args) {

        new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        }.run();
    }
}
