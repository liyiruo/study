package com.线程.死锁2;

/**
 * @Classname DeadLockDemo
 * @Description 测试一个死锁的写法
 * @Date 2020/9/29 11:31
 * @Created by liyiruo
 */
public class DeadLockDemo {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        deadLoad();
    }

    private static void deadLoad() {
        /*
         * 写一个死锁的步骤
         * 1。在锁对象A的的代码块里，让先线程休眠若干秒后，去获取对象B锁
         * 2。在锁对象B的的代码块里，去获取对象A锁
         */
        Thread t1 = new Thread(() -> {

            synchronized (A) {
                System.out.println(Thread.currentThread().getName() + " aaaa");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (B) {
                    System.out.println("1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (B) {
                System.out.println(Thread.currentThread().getName() + " bbb");
                synchronized (A) {
                    System.out.println("2");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
