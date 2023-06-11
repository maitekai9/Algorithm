package com.qkk.daily.ncoder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Permutation.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月06日 21:52:39
 */
public class Permutation {
    public static void getPermutation() {
        String s = "123456789";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int n = chars.length;
        List<List<Character>> res = new ArrayList<>();
        ArrayDeque<Character> deque = new ArrayDeque<>();
        boolean[] used = new boolean[n];
        dfs(n, chars, used, deque, res);
        for (List<Character> list: res) {
            System.out.print(list.get(0));
            System.out.print(list.get(1));
            System.out.print(list.get(2));
            System.out.print(list.get(3));
            System.out.println();
        }
    }

    private static void dfs(int n, char[] chars, boolean[] used, ArrayDeque<Character> deque, List<List<Character>> res) {
        if (deque.size() == n) {
            res.add(new ArrayList<>(deque));
            return;
        }
        for (int j = 0; j < n; j++) {
            if (used[j]) {
                continue;
            }
            if (j > 0 && chars[j] == chars[j - 1] && !used[j - 1]) {
                continue;
            }
            deque.push(chars[j]);
            used[j] = true;
            dfs(n, chars, used, deque, res);
            deque.pop();
            used[j] = false;
        }
    }

    public static void main(String[] args) {
        getPermutation();
    }
}
