package com.leetcode.practice;

/**
 * @author: Miro
 * @date: 2021/4/6 22:13
 * @description:
 */
public class Test05 {
    public String longestPalindrome(String s) {
        int start =0 ;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
           int len1 = getCenter(s,i,i);
           int len2 = getCenter(s,i,i+1);
            int max = Math.max(len1, len2);
            if(max > end -start){
                start = i - (max -1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start,end+1);
    }

    private int getCenter(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }

    public static void main(String[] args) {
        String s = "abcdcbad";
        System.out.println(new Test05().longestPalindrome(s));
    }

}
