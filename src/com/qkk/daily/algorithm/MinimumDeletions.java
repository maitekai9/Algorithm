package com.qkk.daily.algorithm;

/**
 * @ClassName MinimumDeletions.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年03月06日 21:21:28
 */
public class MinimumDeletions {
    public static int minimumDeletions(String s) {
        int n = s.length();
        while (s.contains("ba")) {
            s = s.replace("ba", "");
        }
        return (n - s.length()) / 2;
    }

    public static void main(String[] args) {
        minimumDeletions("aababbab");
    }
}
