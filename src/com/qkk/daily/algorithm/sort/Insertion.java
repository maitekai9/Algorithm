package com.qkk.daily.algorithm.sort;

import java.util.HashMap;

/**
 * @ClassName Insertion.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月26日 12:59:47
 */
public class Insertion {
    public int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int pre = i - 1;
            int cur = nums[i];
//            while (pre >= 0 && nums[pre] > cur) {
//                nums[pre + 1] = nums[pre];
//                pre--;
//            }
            for (int j = pre; j >= 0; j--) {
                if (nums[pre] > cur) {
                    nums[pre + 1] = nums[pre];
                    pre--;
                } else {
                    break;
                }
            }
            nums[pre + 1] = cur;
        }
        return nums;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(1);
        map.put("1", "2");

    }
}
