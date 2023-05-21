package com.qkk.daily.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName WordFilter.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月14日 20:30:10
 */
public class WordFilter {
    DictTree dictTree;
    String weightKey = "##";
    public WordFilter(String[] words) {
        dictTree = new DictTree();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int m = word.length();
            DictTree cur = dictTree;
            for (int j = 0; j < m; j++) {
                DictTree tem = cur;
                for (int k = j; k < m; k++) {
                    String key = word.charAt(k) + "#";
                    if (!tem.children.containsKey(key)) {
                        tem.children.put(key, new DictTree());
                    }
                    tem = cur.children.get(key);
                    tem.weight.put(weightKey, i);
                }
                tem = cur;
                for (int k = j; k < m; k++) {
                    String key = "#" + word.charAt(m - k - 1);
                    if (!tem.children.containsKey(key)) {
                        tem.children.put(key, new DictTree());
                    }
                    tem = tem.children.get(key);
                    tem.weight.put(weightKey, i);
                }
                cur = dictTree;
                String key = new StringBuilder().append(word.charAt(j)).append(word.charAt(m - j - 1)).toString();
                if (!cur.children.containsKey(key)) {
                    cur.children.put(key, new DictTree());
                }
                cur = cur.children.get(key);
                cur.weight.put(weightKey, i);
            }
        }
    }

    public int search(String pref, String suff) {
        DictTree cur = dictTree;
        int n = Math.max(pref.length(), suff.length());
        for (int i = 0; i < n; i++) {
            char p = i < pref.length() ? pref.charAt(i) : '#';
            char s = i < suff.length() ? suff.charAt(suff.length() - i - 1) : '#';
            String key = new StringBuilder().append(p).append(s).toString();
            if (!cur.children.containsKey(key)) {
                return -1;
            }
            cur = cur.children.get(key);
        }
        return cur.weight.get(weightKey);
    }
}
class DictTree {
    Map<String, DictTree> children;
    Map<String, Integer> weight;
    public DictTree() {
        children = new HashMap<>();
        weight = new HashMap<>();
    }
}
