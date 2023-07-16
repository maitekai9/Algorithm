package com.qkk.daily.review.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName PermutationString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月15日 22:11:33
 */
public class PermutationString {
    public static void permutation(String s) {
        char[] chars = s.toCharArray();
        boolean[] dp = new boolean[chars.length];
        List<List<Character>> res = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        back(chars, list, res, dp);
        for (List<Character> l: res) {
            System.out.println(Arrays.toString(l.toArray(new Character[0])));
        }
    }

    private static void back(char[] chars, List<Character> list, List<List<Character>> res, boolean[] dp) {
        if (list.size() == chars.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (dp[i]) {
                continue;
            }
            if (i > 0 && !dp[i - 1] && chars[i - 1] == chars[i]) {
                continue;
            }
            list.add(chars[i]);
            dp[i] = true;
            back(chars, list, res, dp);
            list.remove(list.size() - 1);
            dp[i] = false;
        }
    }

    public static void main(String[] args) {
        permutation("aac");
    }
}
