package com.qkk.daily.algorithm.sort;

/**
 * @ClassName Selection.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月26日 12:45:15
 */
public class Selection {
    public int[] sort(int[] nums) {
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
        return nums;
    }
}
