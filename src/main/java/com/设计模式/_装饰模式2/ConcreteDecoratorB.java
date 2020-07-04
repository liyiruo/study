package com.设计模式._装饰模式2;

/**
 * @author liyiruo
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void addedBehavior() {
        System.out.println("调用了ConcreteDecoratorB.addedBehavior()");
    }
}
