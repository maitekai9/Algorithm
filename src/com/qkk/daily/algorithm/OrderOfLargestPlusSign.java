package com.qkk.daily.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName OrderOfLargestPlusSign.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月09日 21:59:31
 */
public class OrderOfLargestPlusSign {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], n);
        }
        Set<Integer> zeros = new HashSet<>();
        for (int[] mine: mines) {
            zeros.add(mine[0] * n + mine[1]);
        }
        int ans = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (zeros.contains(i * n + j)) {
                    count = 0;
                } else {
                    count++;
                }
                dp[i][j] = Math.min(dp[i][j], count);
            }
            count = 0;
            for (int j = n - 1; j >= 0 ; j--) {
                if (zeros.contains(i * n + j)) {
                    count = 0;
                } else {
                    count ++;
                }
                dp[i][j] = Math.min(dp[i][j], count);
            }
        }
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (zeros.contains(j * n + i)) {
                    count = 0;
                } else {
                    count++;
                }
                dp[j][i] = Math.min(dp[j][i], count);
            }
            count = 0;
            for (int j = n - 1; j >= 0 ; j--) {
                if (zeros.contains(j * n + i)) {
                    count = 0;
                } else {
                    count ++;
                }
                dp[j][i] = Math.min(dp[j][i], count);
                ans = Math.max(dp[j][i], ans);
            }
        }
        return ans;
    }
}
