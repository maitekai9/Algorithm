package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName IntersectionTwo.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月22日 22:49:00
 */
public class IntersectionTwo {
    public int intersectionTwo(int[][] intervals) {
        int n = intervals.length;
        int res = 0, m = 2;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        List<Integer> [] temp = new List[n];
        for (int i = 0; i < n; i++) {
            temp[i] = new ArrayList<>();
        }
        for (int i = n - 1; i >= 0 ; i--) {
            for (int j = intervals[i][0], k = temp[i].size(); k < m ; j++, k++) {
                res++;
                help(intervals, temp, i - 1, j);
            }
        }
        return res;
    }
    public void help(int[][] intervals, List<Integer>[] temp, int a, int b) {
        for (int i = a; i >= 0 ; i--) {
            if (intervals[i][1] < b) {
                break;
            }
            temp[i].add(b);
        }
    }
}
