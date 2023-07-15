package com.qkk.daily.review.sort;

import java.util.Arrays;

/**
 * @ClassName ChooseSort.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月15日 19:52:12
 */
public class ChooseSort {
    public static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tem = nums[i];
                nums[i] = nums[min];
                nums[min] = tem;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        sort(new int[]{5, 4, 3, 2, 1});
    }
}
