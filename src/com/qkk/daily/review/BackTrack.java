package com.qkk.daily.review;

import java.util.Arrays;

/**
 * @ClassName BackTrack.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月02日 13:32:56
 */
public class BackTrack {
    public static int backTrack(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int max = sum / 2;
        boolean[] flag = new boolean[nums.length];
        for (int i = nums[nums.length - 1]; i <= max; i++) {
            if (sum % i != 0) {
                continue;
            }
            int k = sum / i;
            if (back(nums, flag, nums.length - 1, 0, i, k)) {
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }

    private static boolean back(int[] nums, boolean[] flag, int start, int curSum, int target, int k) {
        if (k == 0) {
            System.out.println(curSum);
            return true;
        }
        if (curSum == target) {
            System.out.println(curSum);
            return back(nums, flag, nums.length - 1, 0, target, k - 1);
        }
        for (int i = start; i >= 0; i--) {
            if (flag[i]) {
                continue;
            }
            if (curSum + nums[i] > target) {
                continue;
            }
            flag[i] = true;
            if (back(nums, flag,  i - 1, curSum + nums[i], target, k - 1)) {
                return true;
            }
            flag[i] = false;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        backTrack(nums);
    }
}
