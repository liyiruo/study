package com.线程._ThreadLocal;

/**
 * @author liyiruo
 * @data 2020/3/6  9:26 下午
 */
public class Basic {

    public static ThreadLocal<Long> x = new ThreadLocal<Long>() {
        @Override
        protected Long initialValue() {
            System.out.println("Inital Value run ……");
            return Thread.currentThread().getId();
        }
    };


    public static void main(String[] args) {
        //x.set(101L);
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
