package com.线程.多线程核心技术._2.twoObjectTwoLock;


/**
 * @Classname ThreadA
 * @Description ThreadA
 * @Date 2020/10/9 14:44
 * @Created by liyiruo
 */
public class ThreadA extends Thread {
    HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
