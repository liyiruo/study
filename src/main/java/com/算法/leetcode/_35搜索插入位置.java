package com.算法.leetcode;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 */
public class _35搜索插入位置 {
    public static void main(String[] args) {
        int[] nums = {1};
        int i = searchInsert(nums, 0);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (target==nums[i]) {
                return i;
            }
            if (target<nums[i]&&i==0) {
                return 0;
            }

            if (target > nums[i] && i == nums.length - 1) {
                return i+1;
            }

            if (target < nums[i + 1] && target > nums[i]) {
                return i+1;
            }

        }
        return 99999;
    }
}
