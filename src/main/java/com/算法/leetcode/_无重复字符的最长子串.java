package com.算法.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */


public class _无重复字符的最长子串 {


    public static void main(String[] args) {
        String s = "1123456700";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);

    }


    /**
     * 1.字符串转化成数组
     * 2.从第i个字符计算，和后一个字符j比较 如果不一样，继续往后走  走完都没有停 则返回 len= chars.length-i 如果停了，则返回j-i
     *
     * @param s
     * @return
     */

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        if (chars.length == 0 || chars.length == 1) {
            return chars.length;
        }

        int count = 0;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < len - 1; i++) {
            hashMap.put(chars[i], i);
            for (int j = i + 1; j < len; j++) {
                //取出第j个值，查看是否在map容器里
                boolean b = hashMap.containsKey(chars[j]);

                // 如果在，查看其下标是什么？
                if (b) {
                    int n = (int) hashMap.get(chars[j]);
                    int leng = j - i;
                    count = leng > count ? leng : count;
                    i = n ;
                    hashMap.clear();
                    break;
                } else {
                    hashMap.put(chars[j], j);
                }

            }

            count = hashMap.size() > count ? hashMap.size() : count;

        }
        return count;
    }
}
