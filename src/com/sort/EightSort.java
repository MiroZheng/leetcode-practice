package com.sort;

/**
 * @author: Miro
 * @date: 2021/3/4 22:19
 * @description: 几个排序都是升序排列
 */
public class EightSort {

    /**
     * 插入排序
     */
    public static void insertSort(int[] arr){
        //声明第三个变量，交换数据
        int temp = 0;
        //for循环遍历数组，从第2个开始
        for(int i = 1 ;i<arr.length;i++){
            int j = i ;
            temp = arr[i];
            for(;j>0&&temp<arr[j-1];j--){ //新遍历的数要跟它前一个先比较，比他小需要换位置，并继续往前比较
                //进行交换
                arr[j] = arr[j-1];
            }
            arr[j] = temp; //此时的j 已经是j-- 以后的
        }

    }

    /**
     * 冒泡排序
     * @param
     */
    public static void bubbleSort(int [] array){
        //创建一个对象进行传递
        int temp;
        for(int i = 0;i < array.length-1;i++){
            for (int j = 0 ;j<array.length-i -1 ;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }

    /**
     * 选择排序
     * @param
     */
    public static void selectSort(int [] array){
        //开始for循环
        int temp;
        for(int i = 0;i<array.length;i++){
            int min = array[i];
            int minIndex = i;
            for(int j = i+1;j<array.length;j++){
              if(array[j] < min){
                  min = array[j];
                  minIndex = j;
              }
            }
            if (i != minIndex){
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp ;
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {4,3,7,5,9,6};
//        insertSort(array);
//        bubbleSort(array);
        selectSort(array);
        for(int a : array){
            System.out.println(a);
        }
    }
}
