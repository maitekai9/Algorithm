package com.qkk.daily.hw;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Dfs.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月05日 21:57:58
 */
public class Dfs {
    public static void dfs() {
        String s = "a b a";
        String[] s1 = s.split(" ");
        Arrays.sort(s1);
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        boolean[] used = new boolean[s1.length];
        ArrayDeque<String> deque = new ArrayDeque<>();
        dfs1(s1, 0, deque, list, used);
    }

    public static void dfs1(String[] arr, int depth,
                     ArrayDeque<String> deque,
                     ArrayList<ArrayList<String>> list,
                     boolean[] used) {
        if (depth == arr.length) {
            list.add(new ArrayList<>(deque));
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && arr[i].equals(arr[i - 1]) && !used[i - 1]) {
                continue;
            }
            deque.push(arr[i]);
            used[i] = true;
            dfs1(arr, depth + 1, deque, list, used);
            deque.pop();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        dfs();
    }
}
