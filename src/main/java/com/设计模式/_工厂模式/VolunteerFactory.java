package com.设计模式._工厂模式;

/**
 * @author liyiruo
 */
public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
