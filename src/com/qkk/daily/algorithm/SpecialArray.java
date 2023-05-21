package com.qkk.daily.algorithm;

import java.util.Arrays;

/**
 * @ClassName SpecialArray.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月12日 08:18:11
 */
public class SpecialArray {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0] >= n) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[n - i] >= i && nums[n - 1 - i] < i) {
                return i;
            }
        }
        return -1;
    }
}
