package com.qkk.daily.algorithm;

/**
 * @ClassName IncreasingTriplet.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年01月12日 21:53:03
 */
public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        int[] leftMin = new int[len];
        leftMin[0] = nums[0];
        for (int i = 1; i < len; i++) {
            leftMin[i] = Math.min(nums[i], leftMin[i - 1]);
        }

        int[] rightMax = new int[len];
        rightMax[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
        }

        for (int i = 1; i < len - 1; i++) {
            if (nums[i] > leftMin[i - 1] && nums[i] < rightMax[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static boolean increasingTriplet1(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        int second = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int cur = nums[i];
            if (cur > second) {
                return true;
            } else if (cur > first) {
                second = cur;
            } else {
                first = cur;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 4, 7};
        System.out.println(increasingTriplet1(nums));
    }
}
