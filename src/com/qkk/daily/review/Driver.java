package com.qkk.daily.review;

import java.util.Arrays;

/**
 * @ClassName Driver.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月02日 17:01:56
 */
public class Driver {
    public static void getDriver(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1, count = 0;
        while (l < r) {
            if (nums[l] + nums[r] <= 3) {
                l++;
            }
            r--;
            count++;
        }
        System.out.println(count);
    }
}
