package com.qkk.daily.algorithm;

/**
 * @ClassName CuttingRope2.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月20日 21:54:41
 */
public class CuttingRope2 {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        long ret = 1;
        int p = 1000000007;
        int line = n / 3;
        int b = n % 3;
        for (int i = 1; i < line; i++) {
            ret = ret * 3 % p;
        }

        if (b == 0) {
            return (int) (ret * 3 % p);
        }

        if (b == 1) {
            return (int) (ret * 4 % p);
        }
        return (int) (ret * 6 % p);
    }
}
