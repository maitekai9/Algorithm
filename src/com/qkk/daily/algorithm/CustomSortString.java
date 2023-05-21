package com.qkk.daily.algorithm;

import java.util.*;

/**
 * @ClassName CustomSortString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月13日 12:35:08
 */
public class CustomSortString {
    public String customSortString(String order, String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            charCountMap.put(cur, charCountMap.getOrDefault(cur, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char cur = order.charAt(i);
            if (charCountMap.containsKey(cur)) {
                for (int j = 0; j < charCountMap.get(cur); j++) {
                    res.append(cur);
                }
                charCountMap.remove(cur);
            }
        }
        for (Map.Entry<Character, Integer> entry: charCountMap.entrySet()) {
            char cur = entry.getKey();
            for (int i = 0; i < charCountMap.get(cur); i++) {
                res.append(cur);
            }
        }
        return res.toString();
    }

    public String customSortString1(String order, String s) {
        int[] weight = new int[26];
        for (int i = 0; i < order.length(); i++) {
            char cur = order.charAt(i);
            weight[cur - 'a'] = i + 1;
        }
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars, Comparator.comparingInt(c -> weight[c - 'a']));
        StringBuilder res = new StringBuilder();
        for (Character character: chars) {
            res.append(character);
        }
        return res.toString();
    }
}
