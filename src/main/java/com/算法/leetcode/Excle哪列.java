package com.算法.leetcode;

/**
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class Excle哪列 {
    public static void main(String[] args) {
        String s = "B";
        int i = titleToNumber(s);
        System.out.println(i);
    }

    public static int titleToNumber(String s) {
        //将字符串转化为数组
        //从后往前取值，第i位置，代表x 的 26的i-1次方，累计求和
        char[] chars = s.toCharArray();
        int length = chars.length;
        int result = 0;
        for (int i = length - 1; i >= 0; i--) {
            result += (chars[i] - 'A' + 1) * Math.pow(26, length - i - 1);
        }
        return result;
    }
    public static int getIntFronChar(char c) {
        return c - 'A' + 1;
    }
}
