package com.qkk.daily.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName FindRepeatNumber.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月13日 22:45:40
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num)){
                return num;
            } else {
                set.add(num);
            }
        }
        return 0;
    }
}
