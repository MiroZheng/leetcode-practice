package com.sort;

import java.util.Arrays;

/**
 * @author: Miro
 * @date: 2021/3/27 21:57
 * @description:归并排序
 */
public class MergeSort {

    /**
     * 先拆 数组
     * @param data
     * @param start
     * @param end
     */
    private static void split(int [] data,int start,int end){
        //求中间index
        int middle = (start + end) / 2;
        if(start<end){
            split(data,start,middle);
            split(data,middle+1,end);
            merge(data,start,middle,end);
        }
    }

    /**
     * 合并的方法
     * @param data
     * @param start
     * @param middle
     * @param end
     */
    private static void merge(int[] data, int start, int middle, int end){
        //创建一个临时数据并声明 index
        int [] tmpArr = new int[end - start + 1];
        int index = 0;
        int i = start;
        int j = middle+1;
        while (i <= middle && j <=end){
            if(data[i] < data[j]){
                tmpArr[index] = data[i];
                i++;
            }else {
                tmpArr[index] = data[j];
                j++;
            }
            index ++;
        }
        // 兼容一下不是等长的情况
        while (i<=middle){
            tmpArr[index] = data[i];
            i++;
            index++;
        }
        while (j<=end){
            tmpArr[index] = data[j];
            j++;
            index++;
        }
        //拍好顺序的临时数组给正式数组
        for (int t = 0; t < tmpArr.length; t++) {
            data[t+start] = tmpArr[t];
        }
    }

    public static void main(String[] args) {
        int [] data = {16,2,4,6,9,12,-3,-5,-2,-1,0};
        split(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
}
