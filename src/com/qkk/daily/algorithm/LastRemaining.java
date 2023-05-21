package com.qkk.daily.algorithm;

/**
 * @ClassName LastRemaining.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年01月02日 10:03:14
 */
public class LastRemaining {
    public int lastRemaining(int n) {
        int a1 = 1;
        int k = 0, cnt = n, step = 1;
        while (cnt > 1) {
            if (k % 2 == 0) {
                a1 += step;
            } else {
                if (cnt % 2 == 0) {
                    a1 += step;
                }
            }
            k++;
            cnt = cnt >> 1;
            step = step << 1;
        }
        return a1;
    }
}
