package com.qkk.daily.ncoder;

import java.util.Scanner;

/**
 * @ClassName CommonStr.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月20日 14:01:24
 */
public class CommonStr {
    public String getCommon(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        int max = 0;
        int index = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        index = i - max;
                    }
                }
            }
        }
        return s1.substring(index, max + index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toBinaryString(Integer.parseInt(Integer.toHexString(i))));
    }
}
