package com.设计模式._适配器模式._对象适配器模式;



/**
 * @author liyiruo
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
       Target target = new Adapter(adaptee);
        target.request();
    }
}
