package com.算法.leetcode;


/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 给定 nums = [3,2,2,3], val = 3,
 * <p>
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * <p>
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * <p>
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * <p>
 * 注意这五个元素可为任意顺序。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class _移除元素 {
    public int removeElement(int[] nums, int val) {
        //指针从0开始，从前往后查询 找到val  那么就
        //指针从nums.length从后往前查询 找到非val
        //交换位置，然后在开始下一个循环
        int sum = 0;
        int end = nums.length ;
        int start = 0;
        int temp;

        for (int i = 0; i < end; i++) {
            start = i;
            if (nums[i] != val) {
                continue;
            } else {
                sum++;
            }

            for (int j = end-1; j > start; j--) {
                end = j;
                if (val == nums[j]) {
                    sum++;

                } else {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        return nums.length - sum;
    }


    public static void main(String[] args) {

        int[] nums = {3,1,2,2,3,0,4,2};
        _移除元素 n = new _移除元素();
        int i = n.removeElement(nums, 3);
        System.out.println(i);
    }
}
