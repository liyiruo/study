package com.设计模式._适配器模式._类适配器模式;

/**
 * 适配器模式被适配者
 * @author liyiruo
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用");
    }
}
