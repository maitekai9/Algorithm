package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName CountConsistentStrings.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月08日 21:59:31
 */
public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            characters.add(allowed.charAt(i));
        }
        int res = 0;
        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                if (characters.contains(word.charAt(i))) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
