package com.qkk.daily.ncoder;

import java.util.Arrays;

/**
 * @ClassName GetKMin.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月06日 20:45:58
 */
public class GetKMin {
    public static void getMin() {
        String s = "AbCdeFG";
        int k = 3;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        if (k > chars.length) {
            k = chars.length;
        }
        System.out.println(s.indexOf(chars[k - 1]));
    }

    public static void main(String[] args) {
        getMin();
    }
}

