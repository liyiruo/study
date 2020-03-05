package com.thread;

public class Counter {
    public int count = 0;
    public synchronized void inc() {
        this.count++;
        System.out.println("现在的count："+count);
    }
    @Override
    public String toString() {
        return "TestThread{" +
                "count=" + count +
                '}';
    }
}
