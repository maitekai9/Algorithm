package com.qkk.daily.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName SingleStack.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年03月02日 22:12:21
 */
public class SingleStack {
    public int[] getDiff(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(0);
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[deque.peek()]) {
                while (!deque.isEmpty() && nums[i] > nums[deque.peek()]) {
                    res[deque.peek()] = i - deque.pop();
                }
            }
            deque.push(i);
        }
        return res;
    }
}
