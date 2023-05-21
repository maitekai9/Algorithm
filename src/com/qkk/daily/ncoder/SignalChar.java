package com.qkk.daily.ncoder;

/**
 * @ClassName SignalChar.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月20日 22:43:47
 */
public class SignalChar {
    public char getSignal(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return '1';
    }
}
