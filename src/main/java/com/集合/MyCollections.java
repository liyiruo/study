package com.集合;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap 是Map的子类
 * @author liyiruo
 */
public class MyCollections {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        Set<Object> set = Collections.newSetFromMap(new ConcurrentHashMap<>(256));
    }
}
