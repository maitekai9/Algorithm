package com.qkk.daily.algorithm;

/**
 * @ClassName IsFlipedString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月29日 21:12:52
 */
public class IsFlippedString {
    public boolean isFlippedString(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}
