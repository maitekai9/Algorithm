package com.qkk.daily.algorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName ReplaceWords.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月07日 22:11:38
 */
public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dict = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                String curWord = words[i].substring(0, 1 + j);
                if (dict.contains(curWord)) {
                    words[i] = curWord;
                    break;
                }
            }
        }
        return String.join(" ", words);
    }
}
