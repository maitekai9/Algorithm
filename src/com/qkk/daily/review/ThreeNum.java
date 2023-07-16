package com.qkk.daily.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ThreeNum.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月16日 11:27:52
 */
public class ThreeNum {
    public static void getNum(int [] nums) {
        int n = nums.length;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int cur = nums[i];
            int left = i + 1, right = n - 1;
            while (left < right) {
                int num = cur + nums[left] + nums[right];
                if (num > 0) {
                    right--;
                } else if (num < 0) {
                    left++;
                } else {
                    list.add(new int[]{nums[i], nums[left], nums[right]});
                    if (nums[left] == nums[left + 1]) {
                        left++;
                    }
                    if (nums[right] == nums[right - 1]) {
                        right--;
                    }
                }
            }
        }
        for (int[] arr: list) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

    }
}
