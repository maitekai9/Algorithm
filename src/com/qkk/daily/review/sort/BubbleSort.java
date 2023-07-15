package com.qkk.daily.review.sort;

import java.util.Arrays;

/**
 * @ClassName BubboSort.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月15日 19:02:18
 */
public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tem = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        bubbleSort(new int[]{5, 4, 4, 3, 2, 1});
    }
}
