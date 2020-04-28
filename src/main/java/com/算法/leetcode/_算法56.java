package com.算法.leetcode;


/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 要求时间复杂度是O(n)，空间复杂度是O(1)。
 * <p>
 * 示例1:
 * 输入：nums = [4,1,4,6]
 * 输出：[1,6] 或 [6,1]
 * 示例2:
 * 输入：nums = [1,2,10,4,1,4,3,3]
 * 输出：[2,10] 或 [10,2]
 */
public class _算法56 {


    static int[] func(Integer[] nums) {

        Integer a = 0;
        Integer b = 0;
        //用于将所有的数异或起来
        Integer result = 0;
        //获得k中最低位的1
        Integer mask = 1;

        //1.对整个数据进行异或运算，找出这个两个不同的数字异或运算后 2进制中位值位1的 位置数
        //2. 以这个 位值进行区分，将整个数组区分成2组，对每组尽心异或位运算，2组运算的结果就是2个不同的数字。

        for (int num : nums) {
            result ^= num;
        }

        //mask = k & (-k) 这种方法也可以得到mask，具体原因百度 哈哈哈哈哈
        while ((result & mask) == 0) {
            mask <<= 1;
            System.out.println("二进制输出" + Integer.toBinaryString(mask));

        }
        System.out.println("mask===>" + mask);
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        int[] i = {a,b};
        return i;
    }


}
