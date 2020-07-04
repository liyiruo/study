package com.设计模式._装饰模式2;


/**
 * @author liyiruo
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedState="new state";
        System.out.println("具体装饰对象A的操作");
    }
}
