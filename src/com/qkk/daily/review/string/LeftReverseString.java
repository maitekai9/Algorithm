package com.qkk.daily.review.string;

/**
 * @ClassName LeftReverseString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月14日 22:02:09
 */
public class LeftReverseString {
    public static void reverseString(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        reverse(sb, 0, k - 1);
        reverse(sb, k, sb.length() - 1);
        System.out.println(sb.reverse());
    }

    public static void reverse(StringBuilder sb, int low, int high) {
        while (low < high) {
            char tem = sb.charAt(low);
            sb.setCharAt(low, sb.charAt(high));
            sb.setCharAt(high, tem);
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        reverseString(s, 3);
    }
}
