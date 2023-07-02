package com.qkk.daily.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Flash.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月02日 16:31:58
 */
public class Flash {
    public static void getFlash(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            list.add(nums[i]);
        }
        res.add(min);
        for (int i = 3; i < nums.length; i++) {
            list.remove(0);
            int curMin = Math.min(list.get(0), list.get(1));
            list.add(nums[i]);
            res.add(Math.min(curMin, nums[i]));
        }
        System.out.println(Arrays.toString(res.toArray(new Integer[0])));
    }

    public static void main(String[] args) {
        int[] nums = {12, 3, 8, 6, 5};
        getFlash(nums);
    }
}
