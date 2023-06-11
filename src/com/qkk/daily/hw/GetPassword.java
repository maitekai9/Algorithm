package com.qkk.daily.hw;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName GetPassword.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月09日 21:43:00
 */
public class GetPassword {
    public static void main(String[] args) {
        String s = "2,3,4";
        int min = 2;
        String[] split = s.split(",");
        List<List<String>> res = new ArrayList<>();
        ArrayDeque<String> deque = new ArrayDeque<>();
        dfs(split, 0, min, deque, res);
        for (List<String> li: res) {
            StringBuilder sb = new StringBuilder();
            for (String s1: li) {
                sb.append(s1);
            }
            System.out.println(sb.reverse());
        }
    }

    private static void dfs(String[] split, int i, int min, ArrayDeque<String> deque, List<List<String>> res) {
        if (deque.size() >= min) {
            res.add(new ArrayList<>(deque));
        }
        for (int j = i; j < split.length; j++) {
            deque.push(split[j]);
            dfs(split, j + 1, min, deque, res);
            deque.pop();
        }
    }
}
