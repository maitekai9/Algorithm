package com.qkk.daily.ncoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ThreeSum.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月01日 21:39:34
 */
public class ThreeSum {
    public List<int[]> getSum(int[] nums) {
        Arrays.sort(nums);
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return res;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int cur = nums[i] + nums[left] + nums[right];
                if (cur > 0) {
                    right--;
                } else if (cur < 0) {
                    left++;
                } else {
                    res.add(new int[]{nums[i], nums[left], nums[right]});
                    if (nums[right] == nums[right - 1]) {
                        right--;
                    }
                    if (nums[left] == nums[left + 1]) {
                        left++;
                    }
                }
            }
        }
        return res;
    }
}
