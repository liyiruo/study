package com.设计模式._装饰模式;

/**
 * @author liyiruo
 */
public class SuperCar implements ICar {
    private ICar car;
    public SuperCar(ICar car) {
        this.car = car;
    }
    @Override
    public void move() {
        car.move();
    }

}
