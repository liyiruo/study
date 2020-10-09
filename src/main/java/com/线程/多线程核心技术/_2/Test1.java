package com.线程.多线程核心技术._2;

public class Test1 {
    public void myMethod() {
        synchronized (this) {
            int age = 100;
        }
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.myMethod();
    }

}
