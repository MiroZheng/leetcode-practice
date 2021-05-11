package com.leetcode.practice;

/**
 * @author: Miro
 * @date: 2021/4/9 23:46
 * @description:
 */
public class Test10 {
    public boolean isMatch(String s, String p) {
        //动态规划 先创建一个二维数组
        int m = s.length();
        int n = p.length();
        boolean[][] booleans = new boolean[m + 1][n + 1];
        booleans[0][0] = true;

        for (int i = 1; i <= p.length(); i++) {
            if(p.charAt(i-1) == '*'){
                    booleans[0][i] = booleans[0][i-2];
            }
        }
        for (int si = 1; si <= s.length(); si++) {
            for (int pi = 1; pi <= p.length(); pi++) {
                if(p.charAt(pi-1) == '.' || p.charAt(pi-1) == s.charAt(si-1)){
                    booleans[si][pi] = booleans[si-1][pi-1];
                }else if(p.charAt(pi-1) == '*'){
                    if(p.charAt(pi-2) == '.' || p.charAt(pi-2) == s.charAt(si-1)){
                        booleans[si][pi] = booleans[si][pi-2] || booleans[si-1][pi];
                    }else {
                        booleans[si][pi] = booleans[si][pi-2];
                    }
                }
            }
        }
        return booleans[s.length()][p.length()];
    }

    public static void main(String[] args) {
        String s = "aa";
        String p = "a*";
        System.out.println(new Test10().isMatch(s,p));
    }
}
