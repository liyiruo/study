package com.sjms2.zsqms;

public class AICar extends SuperCar{
    public AICar(ICar car) {
        super(car);
    }
    public void auto() {
        System.out.println("go auto");
    }
    @Override
    public void move() {
        super.move();
        auto();
    }
}
