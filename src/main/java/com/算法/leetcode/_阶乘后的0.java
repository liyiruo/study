package com.算法.leetcode;

/**
 * 阶乘后的0
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 */
public class _阶乘后的0 {
    public static void main(String[] args) {
        int i = trailingZeroes(50);
        System.out.println(i);
    }

    public static int trailingZeroes(int n) {
        int result = 0;
        while (true) {
            if (n > 0) {
                result += n = n / 5;
            } else {
                break;
            }
        }
        return result;
    }
}
