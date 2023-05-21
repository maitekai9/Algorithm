package com.qkk.daily.algorithm;

import java.util.*;

/**
 * @ClassName FindMaxLongChain.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月03日 12:07:59
 */
public class FindMaxLongChain {
    public int findMaxLongChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0;i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }

    public int findMaxLongChain1(int[][] pairs) {
        int cur = Integer.MIN_VALUE, res = 0;
        Arrays.sort(pairs, Comparator.comparing(a -> a[1]));
        for (int[] pair: pairs) {
            if (cur < pair[0]) {
                cur = pair[1];
                res++;
            }
        }
        return res;
    }

    public int findMaxLongChain2(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparing(a -> a[0]));
        List<Integer> list = new ArrayList<>();
        for (int[] pair: pairs) {
            int x = pair[0], y = pair[1];
            if (list.isEmpty() || x > list.get(list.size() - 1)) {
                list.add(y);
            } else {
                int idx = binarySearch(list, x);
                list.set(idx, Math.min(list.get(idx), y));
            }
        }
        return list.size();
    }

    public int binarySearch(List<Integer> arr, int tem) {
        int low = 0, high = arr.size() - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) >= tem) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
