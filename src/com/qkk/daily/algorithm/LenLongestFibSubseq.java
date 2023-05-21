package com.qkk.daily.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LenLongestFibSubseq.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月09日 09:36:33
 */
public class LenLongestFibSubseq {
    public int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        int[][] dp = new int[n][n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j > 0 && arr[j] * 2 > arr[i] ; j++) {
                int k = map.getOrDefault(arr[i] - arr[j], -1);
                if (k >= 0) {
                    dp[j][i] = Math.max(dp[k][j], 3);
                }
                res = Math.max(res, dp[j][i]);
            }
        }
        return res;
    }
}
