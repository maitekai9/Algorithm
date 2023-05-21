package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName MinimumAbsDifference.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月05日 22:42:29
 */
public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();
        int best = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int cur = arr[i + 1] - arr[i];
            if (cur < best) {
                best = cur;
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                list.clear();
                list.add(pair);
            } else if (cur == best) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                list.add(pair);
            }
        }
        return list;
    }
}
