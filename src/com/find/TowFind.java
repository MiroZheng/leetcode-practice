package com.find;

/**
 * @author: Miro
 * @date: 2021/3/17 21:58
 * @description:
 */
public class TowFind {
    /**
     * 传参数
     * @param data 要查找的数组
     * @param left 最小的index一般就是0
     * @param right 数组长度 减 1
     * @param findValue 要查找的数据位置
     * @return 返回结果下标
     */
    public static int Find(int [] data,int left,int right,int findValue){
        int middleIndex = (left + right) / 2;
        if(left >right || findValue < data[left] || findValue>data[right]){
            return -1;
        }
        if(findValue < data[middleIndex]){
            return  Find(data,left,middleIndex,findValue);
        }else if(findValue > data[middleIndex]){
            return Find(data,middleIndex,right,findValue);
        }else if (findValue == data[middleIndex]){
            return middleIndex;
        }
        return middleIndex;
    }

    public static void main(String[] args) {
        int [] data = {1,2,3,4,5,6,7,8,9};
        int result = Find(data, 0, data.length - 1, 10);
        System.out.println(result);
    }
}
