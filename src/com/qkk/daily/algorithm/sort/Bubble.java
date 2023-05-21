package com.qkk.daily.algorithm.sort;

import java.util.*;

/**
 * @ClassName BubbloS.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月26日 12:30:12
 */
public class Bubble {
    public int[] sort(int [] nums) {
        int n  = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tem = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = nums[tem];
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
