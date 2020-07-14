package com.线程.死锁.死锁2;

/**
 * 这是一个死锁的示例
 * @author liyiruo
 */
public class DeadLock implements Runnable{
    private final static Object object1 = new Object();
    private  final static Object object2 = new Object();
    private boolean flag;
    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (object1) {
                System.out.println("flag=true获取到了object1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2) {
                    System.out.println("flag=true如果看到这个，那就出问题了");
                }
            }

        } else {
            synchronized (object2) {
                System.out.println("flag=false获取到了object2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object1) {
                    System.out.println("flag=false如果看到这个，那就出问题了");
                }
            }

        }

    }
}
