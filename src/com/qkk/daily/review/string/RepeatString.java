package com.qkk.daily.review.string;

/**
 * @ClassName RepeatString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月14日 22:15:16
 */
public class RepeatString {
    public static int[] getNext(String s, int n, int j) {
        int[] next = new int[n];
        next[0] = j;
        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static void getIndex(String resource, String target) {
        int n = resource.length();
        int m = target.length();
        int j = -1;
        int[] next = getNext(target, m, j);
        for (int i = 0; i < n; i++) {
            while (j > 0 && resource.charAt(i) != target.charAt(j + 1)) {
                j = next[j];
            }
            if (resource.charAt(i) == target.charAt(j + 1)) {
                j++;
            }
            if (j == m - 1) {
                System.out.println(i - m + 1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        getIndex("aabaabaafa", "aabaaf");
    }
}
