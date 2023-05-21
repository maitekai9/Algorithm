package com.qkk.daily.algorithm;

/**
 * @ClassName ArrayNesting.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月18日 19:40:46
 */
public class ArrayNesting {
    public static int arrayNesting(int[] nums) {
        int ans = 0, n = nums.length;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            while (i < n && !vis[i] ) {
                vis[i] = true;
                i = nums[i];
                ++cnt;
            }
            System.out.println(i);
            ans = Math.max(ans, cnt);
        }
        return ans;
    }

    public static void main(String[] args) {
        arrayNesting(new int[]{1, 2, 3, 4 ,5});
    }
}
