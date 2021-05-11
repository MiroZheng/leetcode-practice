package com.leetcode.practice;

/**
 * @author: Miro
 * @date: 2021/4/10 18:24
 * @description:
 */
public class Test11 {
    public int maxArea(int[] height) {
        //用双指针的方式 从头到尾
        int i =0;
        int j =height.length-1;
        int max = 0;
        while (i<j){
            int h = Math.min(height[i], height[j]);
            max= Math.max(max,h * (j-i));

            if(i<j && height[i] <= h){
                i++;
            }
            if(i<j && height[j] <= h){
                j--;
            }
        }
        return max;
    }
}
