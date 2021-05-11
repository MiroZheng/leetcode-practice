package com.leetcode.practice;

/**
 * @author: Miro
 * @date: 2021/4/12 22:02
 * @description:
 */
public class Test06 {
    public static String convert(String s, int numRows) {
        int length = s.length();
        int row = 2*(numRows - 1);
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < numRows; i++) {
            for (int j =0;j+i < length;j+=row){
                buffer.append(s.charAt(i+j));
                if(i!=0 && i!=numRows -1 && j+row -i <length){
                    buffer.append(s.charAt(j+row-i));
                }
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convert(s,numRows));
//        测试用例:"PAYPALISHIRING"
//        4
//        测试结果:"PINALSIGYAHRPI"
//        期望结果:"PINALSIGYAHRPI"
    }
}
