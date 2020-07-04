package com.设计模式._适配器模式._类适配器模式;

/**
 * 客户端
 *
 * @author liyiruo
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target=new Adapter();
        target.request();
    }
}
