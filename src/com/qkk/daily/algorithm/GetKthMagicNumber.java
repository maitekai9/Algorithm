package com.qkk.daily.algorithm;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @ClassName GetKthMagicNumber.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月28日 22:20:31
 */
public class GetKthMagicNumber {
    public int getKthMagicNumber(int k) {
        int[] factors = {3, 5, 7};
        PriorityQueue<Long> queue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        queue.add(1L);
        set.add(1L);
        int res = 0;
        for (int i = 0; i < k; i++) {
            long cur = queue.poll();
            res = (int) cur;
            for (int factor: factors) {
                long next = cur * factor;
                if (set.add(next)) {
                    queue.offer(next);
                }
            }
        }
        return res;
    }
}
