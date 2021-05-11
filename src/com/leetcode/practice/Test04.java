package com.leetcode.practice;

import java.util.Arrays;

/**
 * @author: Miro
 * @date: 2021/3/30 22:58
 * @description:
 */
public class Test04 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;
        int middle = (len1+len2) / 2;
        int [] result = new int[len1+len2];
        int index = 0;
        int i = 0;
        int j = 0;
        double tmp;
        while (i < len1 && j<len2){
            if(nums1[i] < nums2[j]){
                result[index] = nums1[i];
                i++;
            }else{
                result[index] = nums2[j];
                j++;
            }
            index ++;
        }
        while (i<len1){
            result[index] = nums1[i];
            i++;
            index++;
        }
        while (j<len2){
            result[index] = nums2[j];
            j++;
            index++;
        }
//        System.out.println(Arrays.toString(result));
        if((len1+len2) % 2 ==0){
            tmp = Double.valueOf((result[middle]) + result[middle - 1]) / 2;
        }else{
            tmp = result[middle];
        }
        return tmp;
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
