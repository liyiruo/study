package com.设计模式._建造者模式2;

import java.util.LinkedList;
import java.util.List;

/**
 * 产品类
 *
 * @author liyiruo
 */
public class Product {
    private List<String> parts = new LinkedList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String part :
                parts) {
            System.out.println(part);
        }
    }
}
