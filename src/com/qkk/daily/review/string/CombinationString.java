package com.qkk.daily.review.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName CombinationString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月16日 10:12:08
 */
public class CombinationString {
    public static void combination(String s, int k) {
        char[] chars = s.toCharArray();
        List<List<Character>> list = new ArrayList<>();
        List<Character> res = new ArrayList<>();
        dfs(chars, 0, k, res, list);
        for (List<Character> l: list) {
            System.out.println(Arrays.toString(l.toArray(new Character[0])));
        }
    }

    private static void dfs(char[] chars, int i, int k, List<Character> res, List<List<Character>> list) {
        if (res.size() == k) {
            list.add(new ArrayList<>(res));
            return;
        }
        for (int j = i; j < chars.length ; j++) {
            res.add(chars[j]);
            dfs(chars, j + 1, k, res, list);
            res.remove(res.size() - 1);
        }
    }

    public static void main(String[] args) {
        combination("abcd", 3);
    }
}
