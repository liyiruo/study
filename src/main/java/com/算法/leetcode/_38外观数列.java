package com.算法.leetcode;

import java.util.*;

/**
 * 38. 外观数列
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * <p>
 * 注意：整数序列中的每一项将表示为一个字符串。
 * <p>
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 第一项是数字 1
 * <p>
 * 描述前一项，这个数是 1 即 “一个 1 ”，记作 11
 * <p>
 * 描述前一项，这个数是 11 即 “两个 1 ” ，记作 21
 * <p>
 * 描述前一项，这个数是 21 即 “一个 2 一个 1 ” ，记作 1211
 * <p>
 * 描述前一项，这个数是 1211 即 “一个 1 一个 2 两个 1 ” ，记作 111221
 *
 * @author liyiruo
 */
public class _38外观数列 {
    public static void main(String[] args) {
//        System.out.println(countAndSay(2));
        String desc = desc("1211");
        System.out.println(desc);
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return String.valueOf(n);
        }
        return desc(countAndSay(n - 1));
    }

    public static String desc(String s) {
        StringBuffer buffer = new StringBuffer();
        char[] chars = s.toCharArray();
        LinkedList<Map> list = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            //取出map key为j对应的值；如果
            if (list.size() == 0) {
                Map<Character, Integer> map = new HashMap();
                map.put(chars[i], 1);
                list.add(map);
            } else {
                //看看最近list里的map里的key是否与chars[i]是否相同，
                // 如果相同，map的value加1，如果不同，创建新map
                Map tempMap = list.getLast();
                Character character = (Character) tempMap.keySet().iterator().next();
                if (character == chars[i]) {
                    Integer temp = (Integer) tempMap.values().toArray()[0] + 1;
                    tempMap.put(character, temp);
                } else {
                    Map<Character, Integer> map = new HashMap();
                    map.put(chars[i], 1);
                    list.addLast(map);
                }
            }
        }
        while (!list.isEmpty()) {
            HashMap m = (HashMap) list.getFirst();
            buffer.append(m.values().toArray()[0]).append(m.keySet().toArray()[0]);
            list.removeFirst();
        }
        return buffer.toString();
    }
}
