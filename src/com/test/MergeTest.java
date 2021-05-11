package com.test;

import java.util.Arrays;

/**
 * @author: Miro
 * @date: 2021/3/27 21:15
 * @description: 归并排序
 * 需要先拆后合并
 */
public class MergeTest {


    private static void split(int [] data,int start,int end){
        int middle = (start + end) / 2;
        if(start<end){
            split(data,start,middle);
            split(data,middle+1,end);
            merge(data,start,middle,end);
        }

    }

    /**
     * 构建合并方法
     * @param data
     * @param start
     * @param middle
     * @param end
     */
    private static void merge(int [] data,int start,int middle,int end){
        //构建一个临时数组长度是 end - start +1
        int [] tmpArr = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        int index = 0;//临时数组的index 开始值
        while (i <= middle && j <= end){
            if(data[i]<=data[j]){
                tmpArr[index] = data[i];
                i++;
            }else{
                tmpArr[index] = data[j];
                j++;
            }
            index++;
        }
        while(i<=middle){
            tmpArr[index] = data[i];
            i++;
            index++;
        }
        while (j<=end){
            tmpArr[index] = data[j];
            j++;
            index++;
        }
        for (int t = 0; t < tmpArr.length; t++) {
//            data[t + start] = tmpArr[t];
            System.out.println(start);
            data[t+start] = tmpArr[t];
        }

    }

    public static void main(String[] args) {
        int[] data = {1,3,5,7,9,2,4,6,8,10};
        split(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
}

