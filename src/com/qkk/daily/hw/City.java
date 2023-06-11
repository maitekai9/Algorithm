package com.qkk.daily.hw;

import java.util.Arrays;

/**
 * @ClassName Ctiy.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月10日 09:38:18
 */
public class City {
    public static void main(String[] args) {
        int n_q = 5;
        String s_q = "12 23 34 45";
        String[] split_q = s_q.split(" ");
        for (int i = 1; i <= n_q; i++) {
            int[] store_q = new int[n_q + 1];
            for (int j = 0; j < n_q + 1; j++) {
                store_q[j] = j;
            }
            for (String sp_q: split_q) {
                int pre_q = Integer.parseInt(String.valueOf(sp_q.charAt(0)));
                int next_q = Integer.parseInt(String.valueOf(sp_q.charAt(1)));
                if (pre_q == i || next_q == i) {
                    continue;
                }
                unit_q(store_q, pre_q, next_q);
            }
            int[] dp = new int[n_q + 1];
            for (int j = 1; j <= n_q; j++) {
                dp[find(store_q,j)]++;
            }
            System.out.println(i);
            System.out.println(Arrays.stream(dp).max().getAsInt());
        }
    }

    private static void unit_q(int[] store_q, int pre_q, int next_q) {
        int pre_p = find(store_q, pre_q);
        int next_p = find(store_q, next_q);
        if (pre_p != next_p) {
            store_q[next_q] = pre_p;
        }
    }

    private static int find(int[] store_q, int pre_q) {
        if (pre_q != store_q[pre_q]) {
            store_q[pre_q] = find(store_q, store_q[pre_q]);
        }
        return store_q[pre_q];
    }
}
