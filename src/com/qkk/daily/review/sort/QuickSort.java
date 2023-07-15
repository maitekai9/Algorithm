package com.qkk.daily.review.sort;

import java.util.Arrays;

/**
 * @ClassName QuickSort.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月15日 19:14:31
 */
public class QuickSort {
    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int k = nums[left];
        int low = left, high = right;
        while (low < high) {
            while (low < high && nums[high] >= k) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] <= k) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = k;
        quickSort(nums, left, low - 1);
        quickSort(nums, low + 1, right);
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        quickSort(nums, 0, 4);
        System.out.println(Arrays.toString(nums));
    }
}
