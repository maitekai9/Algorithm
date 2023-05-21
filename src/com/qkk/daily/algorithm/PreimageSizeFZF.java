package com.qkk.daily.algorithm;

/**
 * @ClassName PreimageSizeFZF.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年08月28日 18:34:46
 */
public class PreimageSizeFZF {
    public long zeta(long x) {
        int res = 0;
        while (x != 0) {
            x /= 5;
            res += x;
        }
        return res;
    }

    public long help(long k) {
        long right = 5L * k;
        long left = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (zeta(mid) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right + 1;
    }

    public int preimageSizeFZF(long k) {
        return (int)(help(k + 1) - help(k));
    }
}
