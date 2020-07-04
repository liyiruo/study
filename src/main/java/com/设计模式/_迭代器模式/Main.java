package com.设计模式._迭代器模式;

/**
 * @author liyiruo
 */
public class Main {

    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.set(0, "0");
        a.set(1, "1");
        a.set(2, "2");
        a.set(3, "3");
        a.set(4, "4");
        a.set(5, "5");

        Iterator iterator = new ConcreteIterator(a);
        Object item= iterator.first();
        System.out.println("item===>"+item);
        while (!iterator.isDone()) {
            System.out.println("please buy it==>" + iterator.currentItem());
            iterator.next();
        }
    }
}
