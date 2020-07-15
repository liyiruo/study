package com.线程._ThreadLocal;

/**
 * ThreadLocal是属于某个线程的，数据库的connection。
 * 每个线程都需要，他们又互不影响，就是用这个来实现的。
 * @author liyiruo
 * @date 2020/3/6  9:26 下午
 */
public class Basic {

    private static ThreadLocal<Long> x = new ThreadLocal<Long>() {
        @Override
        protected Long initialValue() {
            System.out.println("Initial Value run ……");
            return Thread.currentThread().getId();
        }
    };
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("main方法里新建的线程：" + x.get());
            }
        }.start();
        //lambda 表达式
       new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
        x.set(109L);
        x.remove();
        System.out.println("main方法自己的主线程" + x.get());
    }
}
