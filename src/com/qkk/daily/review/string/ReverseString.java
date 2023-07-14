package com.qkk.daily.review.string;

import java.util.Arrays;

/**
 * @ClassName ReverseString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月14日 21:22:26
 */
public class ReverseString {
    public static void reverseString(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            int l = i, r = Math.min(chars.length, i + k) - 1;
            while (l < r) {
                char tem = chars[l];
                chars[l] = chars[r];
                chars[r] = tem;
                l++;
                r--;
            }
        }
        System.out.println(Arrays.toString(chars));
    }

    public static void reverseString1(String s) {
        String[] s1 = s.split(" ");
        int l = 0, r = s1.length - 1;
        while (l < r) {
            while (l < r && s1[l].equals("")) {
                l++;
            }
            while (l < r && s1[r].equals("")) {
                r--;
            }
            if (l < r) {
                String tem = s1[l];
                s1[l] = s1[r];
                s1[r] = tem;
                l++;
                r--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s2: s1) {
            if (!s2.equals("")) {
                sb.append(s2);
                sb.append(" ");
            }
        }
        System.out.println(sb.substring(0, sb.length()));
    }

    public static void main(String[] args) {
        reverseString1(" we  are hello ");
    }
}
