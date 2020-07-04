package com.设计模式._装饰模式;

/**
 * @author liyiruo
 */
public class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}