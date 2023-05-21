package com.qkk.daily.algorithm;

/**
 * @ClassName RebuildString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月07日 22:05:35
 */
public class RebuildString {

    public String rebuildString(String s) {
        int n = s.length();
        String[] words = s.trim().split("\\s+");
        int spaceCount = n;
        for (String word: words) {
            spaceCount -= word.length();
        }
        StringBuilder sb = new StringBuilder();
        int len = words.length;
        if (len == 1) {
            sb.append(words[0]);
            for (int i = 0; i < spaceCount; i++) {
                sb.append(" ");
            }
        }
        int per = spaceCount / (len - 1);
        int mer = spaceCount % (len - 1);
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                for (int j = 0; j < per; j++) {
                    sb.append(" ");
                }
            }
            sb.append(words[i]);
        }
        for (int i = 0; i < mer; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
