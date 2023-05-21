package com.qkk.daily.algorithm;

import java.util.*;

/**
 * @ClassName ArrayRankTransform.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月28日 22:16:26
 */
public class ArrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] tem = Arrays.copyOf(arr, n);
        Arrays.sort(tem);
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(tem[i])) {
                map.put(tem[i], map.size() + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
