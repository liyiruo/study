package com.算法.leetcode;


import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class _两数之和 {


    //使用map解决
    //1.查看targer-nums[i] 是否存在map 如果存在 则 map.get(i),nums 是我们要寻找的值
    public int[] twoSum(int[] nums, int target) {

        HashMap map = new HashMap();

        for (int i = 0; i < nums.length; i++) {

            int num = target - nums[i];

            if (map.containsKey(num)) {
                //找到了 new一个数组 存入 i,map.get()
                return new int[]{i, (int) map.get(num)};
            }
            map.put(nums[i], i);
        }

        return null;
    }

//暴力查找  取 第i个数字 获取 target-nums[i], 在后面的数据中查找是否有相同的值
    public  int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                int num = target - nums[i];
                if (num == nums[j]) {
                    System.out.println("i==>"+i+";j==>"+j);
                    return new int[]{i,j};
                }
            }

        }
        return null;
    }


}
