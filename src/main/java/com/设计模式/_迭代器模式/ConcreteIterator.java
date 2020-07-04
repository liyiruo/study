package com.设计模式._迭代器模式;

/**
 * @author liyiruo
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object o = null;
        current++;
        if (current < aggregate.count()) {
            o = aggregate.get(current);
        }
        return o;
    }
    @Override
    public boolean isDone() {
        return current >= aggregate.count();
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}
