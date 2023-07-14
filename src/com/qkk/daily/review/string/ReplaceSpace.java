package com.qkk.daily.review.string;

/**
 * @ClassName ReplaceSpace.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月14日 21:26:54
 */
public class ReplaceSpace {
    public static void replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }


    public static void replaceSpace1(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        char[] res = new char[n + count * 2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                res[j++] = '%';
                res[j++] = '2';
                res[j++] = '0';
            } else {
                res[j++] = s.charAt(i);
            }
        }
        System.out.println(new String(res));
    }

    public static void main(String[] args) {
        replaceSpace1("we are happy");
    }
}
