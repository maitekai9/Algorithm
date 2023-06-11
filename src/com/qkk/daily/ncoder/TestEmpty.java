package com.qkk.daily.ncoder;

/**
 * @ClassName TestEmpty.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月07日 22:07:06
 */
public class TestEmpty {
    public static void main(String[] args) {
        String s = "a   b";
        while (s.indexOf("  ") != -1) {
            s = s.replace("  ", " ");
            System.out.println(s);
        }
    }
}
