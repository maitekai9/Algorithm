package com.qkk.daily.algorithm;

/**
 * @ClassName MinimumSwap.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月25日 22:52:01
 */
public class MinimumSwap {
    public int minimumSwap(String s1, String s2) {
        int xy = 0, yx = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if (c1 == 'x' && c2 == 'y') {
                xy++;
            }
            if (c1 == 'y' && c2 == 'x') {
                yx++;
            }
        }
        if ((xy + yx) % 2 != 0) {
            return -1;
        }
        return xy / 2 + yx / 2 + xy % 2 + yx % 2;
    }
}
