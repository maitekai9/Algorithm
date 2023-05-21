package com.qkk.daily.algorithm;

/**
 * @ClassName MinTaps.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月21日 21:41:31
 */
public class MinTaps {
    public int minTaps(int n, int[] ranges) {
        int[] last = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int l = Math.max(0, i - ranges[0]), r = i + ranges[1];
            last[l] = Math.max(last[l], r);
        }
        int ans = 0, pre = 0, max = 0;
        for (int i = 0; i < n ; i++) {
            max = Math.max(max, last[i]);
            if (max < i) {
                return -1;
            }
            if (pre == i) {
                ans++;
                pre = max;
            }
        }
        return ans;
    }
}
