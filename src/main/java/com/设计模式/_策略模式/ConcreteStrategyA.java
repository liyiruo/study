package com.设计模式._策略模式;

/**
 * 具体实现A
 * @author Administrator
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("ConcreteStrategyA.strategyMethod");
    }
}
