package com.线程.原子类;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.String.valueOf;

/**
 * @Classname TestAtomicInteger
 * @Description 来测试一个原子类
 * @Date 2020/9/30 00:31
 * @Created by liyiruo
 */

public class TestAtomicInteger {
    //private final static Log log = LogFactory.getLog(TestAtomicInteger.class);
    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        ai.set(2);
        System.out.println(ai.get());//2
        System.out.println(ai.getAndIncrement());//2
        System.out.println(ai.get());//3
        System.out.println(ai.incrementAndGet());//4
        System.out.println(ai.addAndGet(5));//9
    }
}
