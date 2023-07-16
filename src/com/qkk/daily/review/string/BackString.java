package com.qkk.daily.review.string;

/**
 * @ClassName BackString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月16日 08:43:55
 */
public class BackString {
    public static void back(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int i = 2; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i - j + 1 < 3) {
                        dp[j][i] = true;
                    } else {
                        dp[j][i] = dp[j + 1][i - 1];
                    }
                }
                if (dp[j][i]) {
                    System.out.println(s.substring(j, i + 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        back("goog");
    }
}
