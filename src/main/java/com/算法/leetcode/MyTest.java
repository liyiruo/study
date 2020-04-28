package com.算法.leetcode;

public class MyTest {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5,6,7};

        // _颜色分类.func2(nums);
       // _算法56.func(nums);
        _两数之和 n = new _两数之和();
        n.twoSum1(nums, 5);
        print(nums);

    }

    static void print(int []i) {
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }
}
