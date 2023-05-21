package com.qkk.daily.algorithm;

/**
 * @ClassName CountPrimeSetBits.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年04月05日 13:14:42
 */
public class CountPrimeSetBits {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (((1 << Integer.bitCount(i)) & 665772) != 0) {
                ans++;
            }
        }
        return ans;
    }
}
