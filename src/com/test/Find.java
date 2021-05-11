package com.test;

/**
 * @author: Miro
 * @date: 2021/3/27 14:01
 * @description:
 */
public class Find {

    /**
     * 二分法查找
     * @param data 数组
     * @param left 左边下标
     * @param right 右边下标
     * @param findVal 寻找的目标
     * @return 结果
     */
    public int findIndex(int [] data,int left,int right,int findVal){
        int middleIndex = (left + right) / 2;
        if(left > right || findVal< data[left] || findVal>data[right]){
            return -1;
        }
        if(data[middleIndex] > findVal){
            return findIndex(data,left,middleIndex,findVal);
        }else if(data[middleIndex] < findVal) {
            return findIndex(data,middleIndex,right,findVal);
        }else {
            return middleIndex;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,12,16,21,22};
        int target = 23;
        System.out.println(new Find().findIndex(arr,0,arr.length-1,target));
    }
}
