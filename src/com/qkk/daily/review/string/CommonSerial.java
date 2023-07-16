package com.qkk.daily.review.string;

/**
 * @ClassName CommonString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月16日 09:07:00
 */
public class CommonSerial {
    public static void common(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[m][n]);
    }

    public static void main(String[] args) {
        String s = "bbbab";
        common(s, new StringBuilder(s).reverse().toString());
    }
}
