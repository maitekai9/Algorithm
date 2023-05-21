package com.qkk.daily.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CuttingRope.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月19日 20:21:25
 */
public class CuttingRope {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int cur = 0;
            for (int j = 1; j < i; j++) {
                cur = Math.max(cur, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = cur;
        }
        return dp[n];

    }
}
