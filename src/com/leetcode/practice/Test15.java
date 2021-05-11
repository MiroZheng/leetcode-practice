package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Miro
 * @date: 2021/4/11 17:56
 * @description:
 */
public class Test15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int j=i+1;
            int k=length-1;
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            while (j < k){
                if( j > i+1 && nums[j] == nums[j-1]){
                    j++;
                    continue;
                }
                int tmp = nums[i] + nums[j] +nums[k];
                if( tmp== 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    listList.add(list);
                    j++;
                    k--;
                }else if(tmp < 0){
                    j++;
                }else {
                    k--;
                }

            }
        }

        return listList;
    }

    public static void main(String[] args) {
        int [] data = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = new Test15().threeSum(data);
        System.out.println(lists);
    }

}
