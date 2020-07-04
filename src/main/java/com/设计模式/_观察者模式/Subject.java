package com.设计模式._观察者模式;

import java.util.ArrayList;
import java.util.List;


/**
 * @author liyiruo
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void iNotify() {
        for (Observer o : observers
        ) {
            o.update();
        }
    }
}
