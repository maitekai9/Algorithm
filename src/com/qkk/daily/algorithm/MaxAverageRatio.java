package com.qkk.daily.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ClassName MaxAverageRatio.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月19日 17:56:30
 */
public class MaxAverageRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            long v1 = (long) (o1[1] + 1) * o1[1] * (o2[1] - o2[0]);
            long v2 = (long) (o2[1] + 1) * o2[1] * (o1[1] - o1[0]);
            return Long.compare(v1, v2);
        });
        for (int[] c: classes) {
            queue.offer(c);
        }
        for (int i = 0; i < extraStudents; i++) {
            int[] cur = queue.poll();
            queue.offer(new int[]{cur[0] + 1, cur[1] + 1});
        }
        double res = 0;
        for (int i = 0; i < classes.length; i++) {
            int[] cur = queue.poll();
            res += 1.0 * cur[0] / cur[1];
        }
        return res / classes.length;
    }
}
