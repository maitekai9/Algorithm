package com.qkk.daily.ncoder;

/**
 * @ClassName Kmp.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月20日 16:01:05
 */
public class Kmp {

    public int[] getNext(String target) {
        int[] next = new int[target.length()];
        int k = -1;
        next[0] = k;
        for (int i = 1; i < target.length(); i++) {
            while (k > -1 && target.charAt(k + 1) != target.charAt(i)) {
                k = next[k];
            }
            if (target.charAt(k + 1) == target.charAt(i)) {
                k += 1;
            }
            next[i] = k;
        }
        return next;
    }

    public int isSon(String source, String target) {
        int[] next = getNext(target);
        int k = -1;
        for (int i = 0; i < source.length(); i++) {
            while (k > -1 && target.charAt(k + 1) != source.charAt(i)) {
                k = next[k];
            }
            if (target.charAt(k + 1) == source.charAt(i)) {
                k += 1;
            }
            if (k == target.length() - 1) {
                return i - target.length() + 1;
            }
        }
        return -1;
    }
}
