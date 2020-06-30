package com.设计模式._策略模式;

/**
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.strategyMethod();
        context.setStrategy(new ConcreteStrategyB());
        context.strategyMethod();
    }
}
