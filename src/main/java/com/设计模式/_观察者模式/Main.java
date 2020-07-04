package com.设计模式._观察者模式;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {

        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("X",s));
        s.attach(new ConcreteObserver("Y",s));
        s.attach(new ConcreteObserver("Z",s));

        s.setSubjectState("abc");
        s.iNotify();
    }
}
