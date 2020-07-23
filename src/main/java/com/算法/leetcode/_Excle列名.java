package com.算法.leetcode;

/**
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class _Excle列名 {
    public static void main(String[] args) throws Exception {
        System.out.println(get(53));
    }

    public static String get(int n) throws Exception {
        int resultX = 0;
        int resultY = 0;
        if (n < 0) {
            throw new Exception("传入的参数非法");
        }
        if (n == 0) {
            return "";
        }
        resultX = n / 26;
        resultY = n % 26;

        if (resultY == 0) {
            return get(resultX - 1).concat(switchIntToStr(26));
        } else {
            return get(resultX).concat(switchIntToStr(resultY));
        }

    }

    public static String switchIntToStr(int n) {
        if (n == 0) {
            return "";
        }
        return String.valueOf((char) (n + 64));
    }
}
