package com.设计模式._外观模式;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        System.out.println("-------------");
        facade.methodB();
    }
}
