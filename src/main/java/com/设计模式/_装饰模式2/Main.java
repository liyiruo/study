package com.设计模式._装饰模式2;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
       Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecoratorA(component);
        decorator = new ConcreteDecoratorB(decorator);
        decorator.operation();


    }
}
