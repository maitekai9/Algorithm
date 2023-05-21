package com.qkk.daily.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SequenceReconstruction.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月23日 08:29:14
 */
public class SequenceReconstruction {
    public boolean sequenceReconstruction(int[] nums, int[][] sequences) {
        int n = nums.length;
        int[] indegrees = new int[n + 1];
        Set<Integer>[] graph = new Set[n + 1];
        for (int i = 1; i < n + 1; i++) {
            graph[i] = new HashSet<>();
        }
        for (int[] sequence: sequences) {
            for (int i = 1; i < sequence.length ; i++) {
                int pr = sequence[i - 1], ne = sequence[i];
                if (graph[pr].add(ne)) {
                    indegrees[ne]++;
                }
            }
        }
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i < n + 1 ; i++) {
            if (indegrees[i] == 0) {
                deque.offer(i);
            }
        }
        while (!deque.isEmpty()) {
            if (deque.size() > 1) {
                return false;
            }
            int num = deque.poll();
            Set<Integer> set = graph[num];
            for (int s: set) {
                indegrees[s]--;
                if (indegrees[s] == 0) {
                    deque.offer(s);
                }
            }
        }
        return true;
    }
}
