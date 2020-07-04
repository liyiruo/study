package com.设计模式._迭代器模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author liyiruo
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> items=new ArrayList<>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void set(int index, Object o) {
        items.add(index,o);
    }

}
