package com.线程.线程创建和安全.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.openjdk.jol.info.ClassLayout;

/**
 * @Classname _sync
 * @Description TODO
 * @Date 2020/10/9 20:31
 * @Created by liyiruo
 */
public class _sync {
    public static void main(String[] args) {
        Lock mlock=new ReentrantLock();

        MyTest lock=new MyTest();
        ClassLayout layout = ClassLayout.parseInstance(lock);
        System.out.println(layout.toPrintable());

        System.out.println("---------------");

        synchronized(lock) {
            ClassLayout o = ClassLayout.parseInstance(lock);
            System.out.println(o.toPrintable());
        }
    }
}
