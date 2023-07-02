package com.qkk.daily.review;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @ClassName SingleStack.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月02日 17:13:26
 */
public class SingleStack {
    public static void getSingle(int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] single = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty()) {
                if (nums[deque.peek()] <= nums[i]) {
                    deque.pop();
                    single[i]++;
                } else {
                    single[i] = 1;
                    break;
                }
            }
            deque.push(i);
        }
        System.out.println(Arrays.toString(single));
    }

    public static void main(String[] args) {
        int[] nums = {3,3,1,4,3,5};
        getSingle(nums);
    }
}
