package com.test;

import java.util.Arrays;

/**
 * @author: Miro
 * @date: 2021/3/27 14:39
 * @description:
 */
public class QuickTest {

    public static void QSort(int [] data,int start,int end){
       int index = getIndex(data,start,end);
       getIndex(data,start,index-1);
       getIndex(data,index+1,end);

    }

    private static int getIndex(int[] data, int start, int end) {
        int i = start;
        int j = end;
        int tmp = data[i];
        while (i<j){
            while (j>i &&data[j]>tmp){
                j--;
            }
            if(data[j]<tmp){
                data[i] = data[j];
                i++;
            }
            while (i<j&&data[i]<tmp){
                i++;
            }
            if(data[i]>tmp){
                data[j] = data[i];
            }
        }
        data[i] = tmp;
        return i;
    }

    public static void main(String[] args) {
        int [] data = {6,3,1,4,8,5,9,2};
        QSort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
}
