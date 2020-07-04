package com.设计模式._迭代器模式;

/**
 * @author liyiruo
 */
public interface Iterator {
    /**
     * 获取到第一个数据
     * @return Object
     */
    Object first();

    /**
     * 获取下一个数据
     * @return Object
     */
    Object next();

    /**
     *
     * @return boolean
     */
    boolean isDone();

    Object currentItem();

}
