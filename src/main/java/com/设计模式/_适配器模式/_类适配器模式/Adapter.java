package com.设计模式._适配器模式._类适配器模式;

/**
 * @author liyiruo
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
