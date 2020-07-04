package com.设计模式._桥接模式;

/**
 * @author liyiruo
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("come from ConcreteImplementorB");
    }
}
