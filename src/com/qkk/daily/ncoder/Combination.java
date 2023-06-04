package com.qkk.daily.ncoder;

import java.util.*;

/**
 * @ClassName combination.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月04日 12:23:02
 */
public class Combination {
    static List<Deque<Integer>> res = new ArrayList<>();
    static Deque<Integer> deque = new ArrayDeque<>();
    public static void getCombination(int targetNum, int n, int k, int num, int startIndex) {
        if (num > targetNum) {
            return;
        }
        if (k == deque.size()) {
            if (targetNum == num) {
                res.add(new ArrayDeque<>(deque));
            }
            return;
        }
        for (int i = startIndex; i <= n - (k - deque.size()) + 1; i++) {
            deque.push(i);
            num += i;
            getCombination(targetNum, n, k, num, i + 1);
            num -= i;
            deque.pop();
        }
    }

    public static void main(String[] args) {
        getCombination(9, 9, 3, 0, 1);
        for (Deque<Integer> deque: res) {
            System.out.println(Arrays.toString(new Deque[]{deque}));
        }
    }
}
