package com;

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
    static Object obj1 = new Object();
    static Object obj2 = new Object();
    public DeadLockTest(boolean flag) {
        this.flag = flag;
    }
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
