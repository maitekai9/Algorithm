package com.qkk.daily.algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @ClassName Combine.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月17日 23:18:17
 */
public class Combine {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n , k);
        return res;
    }

    public void dfs(int index, int n, int k) {
        if (deque.size() == k) {
            res.add(new ArrayList<>(deque));
        }
        for (int i = index; i <= n ; i++) {
            deque.push(i);
            dfs(i + 1, n, k);
            deque.pop();
        }
    }
}
