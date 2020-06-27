package com.设计模式._工厂模式;

/**
 * @author liyiruo
 */
public class Volunteer extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("Volunteer-sweep");
    }

    @Override
    public void wash() {
        System.out.println("Volunteer-wash");
    }

    @Override
    public void buyRice() {
        System.out.println("Volunteer-buyRice");
    }
}
