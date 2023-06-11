package com.qkk.daily.ncoder;

import java.util.*;
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
//        int n = 5;
//        int tem = n - 1;
//        tem |= tem >>> 1;
//        tem |= tem >>> 2;
//        tem |= tem >>> 4;
//        tem |= tem >>> 8;
//        tem |= tem >>> 16;
//        System.out.println(tem + 1);
        System.out.println((long) Math.ceil(Math.log10(110)));
    }
}
