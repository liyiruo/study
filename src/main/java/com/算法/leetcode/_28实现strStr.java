package com.算法.leetcode;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回  -1。
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class _28实现strStr {
    public static void main(String[] args) {
        System.out.println(strStr("a", ""));
    }
    public static int strStr(String haystack, String needle) {
        char[] haystacks = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        if (needle.isEmpty()) {
            return 0;
        }
        int length = haystacks.length;
        int len = needles.length;
        for (int i = 0; i < length; i++) {
            if (i + len > length) {
                return -1;
            }
            boolean flag = true;
            for (int j = 0; j < len; j++) {
                if (!(needles[j] == haystacks[i + j])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
