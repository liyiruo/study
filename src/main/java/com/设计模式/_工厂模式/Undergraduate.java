package com.设计模式._工厂模式;

/**
 * @author liyiruo
 */
public class Undergraduate extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("Undergraduate-sweep");
    }

    @Override
    public void wash() {
        System.out.println("Undergraduate-wash");
    }

    @Override
    public void buyRice() {
        System.out.println("Undergraduate-buyRice");
    }
}
