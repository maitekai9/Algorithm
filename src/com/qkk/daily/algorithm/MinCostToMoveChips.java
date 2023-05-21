package com.qkk.daily.algorithm;

/**
 * @ClassName MinCostToMoveChips.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月08日 20:10:41
 */
public class MinCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int pos: position) {
            if ((pos & 1) == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}
