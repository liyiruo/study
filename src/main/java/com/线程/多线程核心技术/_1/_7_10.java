package com.线程.多线程核心技术._1;

import java.util.Map;

/**
 * @Classname _7_10
 * @Description 线程的几个方法
 * @Date 2020/10/5 10:56
 * @Created by liyiruo
 */
public class _7_10 {
    public static void main(String[] args) {
        Map<Thread, StackTraceElement[]> traces = Thread.getAllStackTraces();
        Thread.dumpStack();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        Thread.State state = Thread.currentThread().getState();
    }
}
