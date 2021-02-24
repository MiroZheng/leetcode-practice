package com.leetcode.practice;

import java.util.HashMap;

/**
 * @author: Miro
 * @date: 2021/2/4 22:20
 * @description:
 */


//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
// 你可以按任意顺序返回答案。
// 示例 1：
//
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//
// 示例 2：
//
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
//
// 示例 3：
//
//输入：nums = [3,3], target = 6
//输出：[0,1]
//
// 提示：
//
// 2 <= nums.length <= 103
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// 只会存在一个有效答案
//
// Related Topics 数组 哈希表
// 👍 10344 👎 0


public class Test01 {
    public static int[] twoSum(int[] nums, int target) {
        //创建一个hashmap
        HashMap<Integer, Integer> hashMap = new HashMap();
        //创建一个2个元素的数组
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++){
            if(hashMap.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = hashMap.get(target - nums[i]);
            }
            hashMap.put(nums[i],i); //注意这里要后put，主要是因为示例3
        }

        return result;
    }

    public static void main(String[] args) {
        int [] nums = {3,3};
        int target = 6;
        int[] ints = twoSum(nums, target);
        for(int i :ints){
            System.out.println(i);
        }
    }

}
