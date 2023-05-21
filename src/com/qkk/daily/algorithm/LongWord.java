package com.qkk.daily.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LongWord.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年03月17日 21:13:35
 */
public class LongWord {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String longestWord = "";
        Set<String> wordSet = new HashSet<>();
        wordSet.add("");
        for (String word: words) {
            if (wordSet.contains(word.substring(0, words.length - 1))) {
                if (longestWord.length() < word.length()) {
                    wordSet.add(word);
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
}
