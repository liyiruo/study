package com.设计模式.sjms2.zsqms;

public class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("this car will fly");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
