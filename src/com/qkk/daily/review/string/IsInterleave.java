package com.qkk.daily.review.string;

/**
 * @ClassName IsInterleave.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月15日 22:01:54
 */
public class IsInterleave {
    public static void isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int p = i + j - 1;
                if (i > 0 && s1.charAt(i - 1) == s3.charAt(p)) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j];
                }
                if (j > 0 && s2.charAt(j - 1) == s3.charAt(p)) {
                    dp[i][j] = dp[i][j] || dp[i][j - 1];
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
