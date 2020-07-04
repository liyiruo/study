package com.设计模式._装饰模式2;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecoratorB(component);
        decorator = new ConcreteDecoratorA(decorator);
        decorator.operation();

        new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent())).operation();
        System.out.println("===================");
        new ConcreteDecoratorA(new ConcreteDecoratorA(new ConcreteComponent())).operation();


    }
}
