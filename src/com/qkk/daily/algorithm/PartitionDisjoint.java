package com.qkk.daily.algorithm;

/**
 * @ClassName PartitionDisjoint.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月24日 21:00:38
 */
public class PartitionDisjoint {
    public int partitionDisjoint(int[] nums) {
        int leftPos = 0;
        int leftMax = nums[0];
        int curMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            curMax = Math.max(curMax, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = curMax;
                leftPos = i;
            }
        }
        return leftPos + 1;
    }
}
