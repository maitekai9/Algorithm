package com.qkk.daily.algorithm;

/**
 * @ClassName MinimumRecolors.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年03月09日 21:58:05
 */
public class MinimumRecolors {
    public int minimumRecolors(String blocks, int k) {
        int l = 0, r = 0, count = 0;
        while (r < k) {
            if (blocks.charAt(r) == 'W') {
                count++;
            }
            r++;
        }
        int res = count;
        while (r < blocks.length()) {
            count += blocks.charAt(r) == 'W' ? 1 : 0;
            count -= blocks.charAt(l) == 'W' ? 1 : 0;
            res = Math.min(res, count);
            r++;
            l++;
        }
        return res;
    }
}
