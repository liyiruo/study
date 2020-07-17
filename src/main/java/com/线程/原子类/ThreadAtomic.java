package com.线程.原子类;

/**
 * 这个用的不是原子类，最终的结果有的不是2000，是出现的并发问题
 * @author liyiruo
 */
public class ThreadAtomic {
    private static int n;
    public static void main(String[] args) {
        int j = 0;
        while (j < 100) {
             n = 0;
            j++;

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        n++;
                    }
                }
            });


            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        n++;
                    }
                }
            });


            thread1.start();
            thread2.start();
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("n的最终值为：" + n);
        }
    }
}
