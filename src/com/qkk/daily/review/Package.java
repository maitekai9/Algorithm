package com.qkk.daily.review;

import java.util.Arrays;

/**
 * @ClassName Package.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月03日 22:53:32
 */
public class Package {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int[][] dp = new int[weight.length + 1][5];
        for (int i = 1; i <= weight.length; i++) {
            for (int j = 1; j <= 4; j++) {
                if (weight[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                }
            }
        }
        for (int[] v: dp) {
            System.out.println(Arrays.toString(v));
        }
    }
}
