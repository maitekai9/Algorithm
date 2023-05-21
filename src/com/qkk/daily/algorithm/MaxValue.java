package com.qkk.daily.algorithm;

/**
 * @ClassName MaxValue.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年03月08日 22:07:58
 */
public class MaxValue {
    public int maxValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                }
                if (j > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                }
                dp[i][j] += grid[i][j];
            }
        }
        return dp[n - 1][m - 1];
    }
}
