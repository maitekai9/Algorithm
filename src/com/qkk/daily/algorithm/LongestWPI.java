package com.qkk.daily.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LongestWPI.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月14日 22:51:06
 */
public class LongestWPI {
    public int longestWPI(int[] hours) {
        int res = 0;
        int preSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hours.length; i++) {
            preSum += hours[i] > 8 ? 1 : -1;
            if (preSum > 0) {
                res = i + 1;
            } else {
                map.putIfAbsent(preSum, i);
                if (map.containsKey(preSum - 1)) {
                    res = Math.max(res, i - map.get(preSum - 1));
                }
            }
        }
        return res;
    }
}
