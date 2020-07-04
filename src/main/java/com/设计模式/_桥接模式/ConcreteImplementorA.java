package com.设计模式._桥接模式;

/**
 * @author liyiruo
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("come from ConcreteImplementorA");
    }
}
