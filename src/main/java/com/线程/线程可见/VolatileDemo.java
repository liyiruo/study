package com.线程.线程可见;

/**
 * 1。保证线程可见
 * 2。阻止cpu执行重排序
 *
 * @author liyiruo
 */
public class VolatileDemo {
    volatile boolean flag = true;

    public void dosome() {
        while (flag) {
            try {
                Thread.sleep(1000);
                System.out.println("验证线程可见的功能");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void reset() {
        flag = false;
        System.out.println("flag==>"+flag);
    }


    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        volatileDemo.dosome();
        try {
            Thread.sleep(10000);
            volatileDemo.reset();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
