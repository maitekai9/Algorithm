package com.qkk.daily.algorithm;

/**
 * @ClassName HasAlternatingBits.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年03月28日 21:53:05
 */
public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int prev = 2;
        while (n != 0) {
            int cur = n % 2;
            if (cur == prev) {
                return false;
            }
            prev = cur;
            n >>= 1;
        }
        return true;
    }

    public boolean hasAlternatingBits1(int n) {
        int a = n ^ (n >> 1);
        return (a & (a + 1)) == 0;
    }
}
