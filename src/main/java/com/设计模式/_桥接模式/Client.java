package com.设计模式._桥接模式;

/**
 * 桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 * @author liyiruo
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction  =new RefinedAbstraction();
        abstraction.setImplementor(implementor);
        abstraction.operation();


        abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();

    }
}
