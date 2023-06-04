package com.qkk.daily.ncoder;

import java.util.regex.Pattern;

/**
 * @ClassName Pattern.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月02日 21:11:52
 */
public class TestPattern {
    public static void patter() {
//        Pattern compile = Pattern.compile("[^A-Z]+");
//        System.out.println(compile.matcher("abc").matches());
        System.out.println(Pattern.matches("[^a-z]+", "123A"));
    }

    public static void main(String[] args) {

    }
}
