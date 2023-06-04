package com.qkk.daily.ncoder;

/**
 * @ClassName SerialSum.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月04日 13:29:27
 */
public class SerialSum {
    public static int getSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int cur : nums) {
            if (sum < 0 && cur > 0) {
                sum = cur;
            } else {
                sum += cur;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    public static int getSum1(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getSum1(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
