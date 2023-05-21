package com.qkk.daily.algorithm;

import java.util.Arrays;

/**
 * @ClassName NextGreatestLetter.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年04月03日 10:53:50
 */
public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        for (char ch: letters) {
            if (ch > target) {
                return ch;
            }
        }
       return letters[0];
    }
}
