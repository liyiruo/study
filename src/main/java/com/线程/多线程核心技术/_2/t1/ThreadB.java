package com.线程.多线程核心技术._2.t1;

/**
 * @Classname ThreadB
 * @Description ThreadB
 * @Date 2020/10/9 14:46
 * @Created by liyiruo
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
