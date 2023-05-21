package com.qkk.daily.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @ClassName MincostToHireWorkers.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月11日 10:05:48
 */
public class MinCostToHireWorkers {
    public static double minCostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Integer[] h = new Integer[n];
        for (int i = 0;i < n;i++) {
            h[i] = i;
        }
        Arrays.sort(h, (a, b) -> quality[b] * wage[a] - quality[a] * wage[b]);
        double res = 1e9;
        double totalq = 0.0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < k - 1; i++) {
            totalq += quality[h[i]];
            pq.offer(quality[h[i]]);
        }
        for (int i = k - 1; i < n ; i++) {
            int dx = h[i];
            totalq += quality[dx];
            pq.offer(quality[dx]);
            double totalc = ((double) wage[dx] / quality[dx]) * totalq;
            res = Math.min(res, totalc);
            totalq -= pq.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        minCostToHireWorkers(new int[]{10, 20, 5}, new int[]{70, 50, 30}, 2);
    }
}
