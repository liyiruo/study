package com.设计模式._工厂模式;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        //IFactory factory = new UndergraduateFactory();UndergraduateFactory
        IFactory factory = new VolunteerFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }
}
