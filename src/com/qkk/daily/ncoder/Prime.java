package com.qkk.daily.ncoder;

/**
 * @ClassName Prime.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月20日 22:48:21
 */
public class Prime {
    public int[] getPrime(int target) {
        int i = target / 2, j = target - i;
        while (i < target) {
            if (!isPrime(i) || isPrime(j)) {
                i++;
                j--;
                continue;
            }
            return new int[] {j, i};
        }
        return new int[]{0, 0};
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
