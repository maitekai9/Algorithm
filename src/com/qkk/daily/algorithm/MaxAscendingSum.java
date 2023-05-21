package com.qkk.daily.algorithm;

/**
 * @ClassName MaxAscendingSum.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月08日 21:19:15
 */
public class MaxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int ans = nums[0], num = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                num += nums[i + 1];
            } else {
                num = nums[i + 1];
            }
            if (ans < num) {
                ans = num;
            }
        }
        return ans;
    }
}
