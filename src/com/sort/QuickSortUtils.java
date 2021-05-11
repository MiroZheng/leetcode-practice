package com.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: Miro
 * @date: 2021/3/18 9:22
 * @description:
 */
public class QuickSortUtils {

    public static void quickSort(int [] data,int start,int end){

        if(start<end){
            int index = getIndex(data,start,end);
            quickSort(data,start,index-1);
            quickSort(data,index+1,end);
        }
    }

    private static int getIndex(int[] data, int start, int end) {
        int i = start;
        int j = end;
        int tmp = data[i];
        while (i < j) {
            //从最后开始找比目标值小的数
            while (j > i && data[j] > tmp) {
                j--;
            }
            if (j > i) {//说明在目标i的后面找到了比tmp小的数
                data[i] = data[j];
                i++;
            }
            //开始从目标值往后找比目标值大的数
            while (i < j && data[i] < tmp) {
                i++;
            }
            if (i < j) {
                data[j] = data[i];
                j--;
            }
        }
        data[i] = tmp;
        return i;
    }

    public static void main(String[] args) {
        int [] data = {1,2,78,98,35,22,5,7,-3,48};
        quickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}
