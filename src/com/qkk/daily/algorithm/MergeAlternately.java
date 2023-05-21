package com.qkk.daily.algorithm;

/**
 * @ClassName MergeAlternately.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月23日 13:28:38
 */
public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int minLen = Math.min(m, n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (m > minLen) {
            sb.append(word1.substring(minLen));
        }
        if (n > minLen) {
            sb.append(word2.substring(minLen));
        }
        return sb.toString();
    }
}
