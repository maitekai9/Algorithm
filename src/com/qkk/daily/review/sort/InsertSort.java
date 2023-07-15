package com.qkk.daily.review.sort;

import java.util.Arrays;

/**
 * @ClassName InsertSort.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月15日 20:41:36
 */
public class InsertSort {
    public static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int cur = nums[i];
            int j = i;
            while (j > 0 && cur < nums[j - 1]) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = cur;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        sort(new int[]{5, 4, 3, 2, 1});
    }
}
