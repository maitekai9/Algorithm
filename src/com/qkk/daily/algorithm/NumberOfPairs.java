package com.qkk.daily.algorithm;

import java.util.*;

/**
 * @ClassName NumberOfPairs.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月16日 21:38:44
 */
public class NumberOfPairs {
    public int[] numberOfPairs(int[] nums) {
//        Deque<Integer> deque = new ArrayDeque<>();
//        Arrays.sort(nums);
//        for (int num: nums) {
//            if (!deque.isEmpty() && deque.peek() == num) {
//                deque.pop();
//            } else {
//                deque.push(num);
//            }
//        }
//        return new int[]{(nums.length - deque.size()) / 2, deque.size()};
        Map<Integer, Integer> map = new HashMap<>();
        int repeat = 0;
        for (int num: nums) {
            map.put(num, -map.getOrDefault(num, 1));
            if (map.get(num) == 1) {
                repeat++;
            }
        }
        return new int[] {repeat, nums.length - repeat * 2};
    }
}
