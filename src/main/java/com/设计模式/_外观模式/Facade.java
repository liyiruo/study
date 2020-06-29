package com.设计模式._外观模式;

/**
 * 外观类
 *
 * @author liyiruo
 */
public class Facade {
    private SystemOne one;
    private SystemTwo two;
    private SystemThree three;
    private SystemFour four;


    public Facade() {
        this.one = new SystemOne();
        this.two = new SystemTwo();
        this.three = new SystemThree();
        this.four = new SystemFour();
    }

    public void methodA() {
        one.methodOne();
        two.methodTwo();
        three.methodThree();
    }

    public void methodB() {
        one.methodOne();
        two.methodTwo();
        four.methodFore();
    }
}
