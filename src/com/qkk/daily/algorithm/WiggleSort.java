package com.qkk.daily.algorithm;

import java.util.Arrays;

/**
 * @ClassName FiggleSort.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年06月28日 22:28:23
 */
public class WiggleSort {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        int x = (n + 1) / 2;
        for (int i = 0, j = x - 1, k = n - 1; i < n; i += 2, j--, k--) {
            nums[i] = arr[j];
            if ((i + 1) < n) {
                nums[i + 1] = arr[k];
            }
        }
    }
}
