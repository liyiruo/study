package com.测试;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *测试Iterator 迭代器的设计模式
 * @author liyiruo
 */
public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Iterator iterator = list.iterator();
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
