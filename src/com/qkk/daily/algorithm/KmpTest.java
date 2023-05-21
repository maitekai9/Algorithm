package com.qkk.daily.algorithm;

import java.util.Arrays;

/**
 * @ClassName KmpTest.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年04月05日 13:26:29
 */
public class KmpTest {
    public static int[] getNext(char[] patter) {
        int n  = patter.length;
        int[] next = new int[n + 1];
        next[0] = -1;
        int i = 0, j = -1;
        while (i < n) {
            if (j == - 1 || patter[i] == patter[j]) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'a', 'b', 'c', 'a', 'b', 'a', 'b', 'c'};
        char[] pattern = {'a', 'b', 'c', 'a', 'b'};
        int[] next = getNext(pattern);
        int i = 0, j = 0;
        while (j < pattern.length) {
            if (j == -1 || chars[i] == pattern [j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == pattern.length) {
            System.out.println(i - j);
        } else {
            System.out.println("mei");
        }

    }
}
