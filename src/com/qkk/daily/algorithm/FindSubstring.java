package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName FindSubstring.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年06月23日 22:58:59
 */
public class FindSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int m = words.length, n = words[0].length(), ls = s.length();
        for (int i = 0; i < n; i++) {
            if (i + m * n > ls) {
                break;
            }
            Map<String, Integer> differ = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String str = s.substring(i + j * n, i + (j + 1) * n);
                differ.put(str, differ.getOrDefault(str, 0) + 1);
            }
            for (String word: words) {
                differ.put(word, differ.getOrDefault(word, 0) - 1);
                if (differ.get(word) == 0) {
                    differ.remove(word);
                }
            }
            for (int k = i; k < ls - m * n + 1; k += n) {
                if (k != i) {
                    String prev = s.substring(k - n, k);
                    differ.put(prev, differ.getOrDefault(prev, 0) - 1);
                    if (differ.get(prev) == 0) {
                        differ.remove(prev);
                    }
                    String cur = s.substring(k + n * (m - 1), k + n * m);
                    differ.put(cur, differ.getOrDefault(cur, 0) + 1);
                    if (differ.get(cur) == 0) {
                        differ.remove(cur);
                    }
                }
                if (differ.isEmpty()) {
                    res.add(k);
                }
            }
        }
        return res;
    }
}
