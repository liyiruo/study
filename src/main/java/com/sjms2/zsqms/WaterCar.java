package com.sjms2.zsqms;

public class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }

    public void water() {
        System.out.println("this car can swim");
    }
    @Override
    public void move() {
        super.move();
        water();
    }
}
