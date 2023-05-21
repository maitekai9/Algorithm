package com.qkk.daily.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BestHand.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月20日 20:11:27
 */
public class BestHand {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flag = true;
        for (int i = 0; i < suits.length - 1; i++) {
            if (suits[i] != suits[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return "Flush";
        } else {
            Arrays.sort(ranks);
            int count = 1;
            int res = 0;
            for (int i = 1; i < ranks.length; i++) {
                if (ranks[i] == ranks[i - 1]) {
                    count++;
                } else {
                    res = Math.max(res, count);
                    count = 1;
                }
            }
            return res == 1 ? "High Card" : res > 2 ? "Three of a Kind" : "Pair";
        }
    }
}
