package com.线程.死锁;

/**
 * 测试死锁
 * 死锁形成的条件
 * 1.互次条件
 * 2.不可剥夺条件
 * 3.请求与保持条件
 * 4.循环等待条件
 * @author liyiruo
 */
public class DeadLock {

    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLockTest(true));
        Thread t2 = new Thread(new DeadLockTest(false));
        t1.start();
        t2.start();
    }
}

class DeadLockTest implements Runnable{

    private boolean flag;
    private static final Object obj1 = new Object();
    private static final Object obj2 = new Object();
    DeadLockTest(boolean flag) {
        this.flag = flag;
    }
    @Override
    public void run(){
        if(flag){
            synchronized(obj1){
                System.out.println("if lock1");
                synchronized (obj2) {
                    System.out.println("if lock2");
                }
            }
        }else{
            synchronized (obj2) {
                System.out.println("else lock2");
                synchronized (obj1) {
                    System.out.println("else lock1");
                }
            }
        }
    }
}
