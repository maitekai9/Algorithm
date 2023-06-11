package com.qkk.daily.ncoder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Plus.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月19日 23:04:53
 */
public class Plus {
    public static void main(String[] args) {
        String s1 = "11123456";
        String s2 = "54987950";
        BigDecimal bigDecimal = new BigDecimal(s1);
        BigDecimal bigDecimal1 = new BigDecimal(s2);
        System.out.println(bigDecimal.add(bigDecimal1));
        List<Integer> list = new ArrayList<>();
        list.sort(Comparator.comparingInt(o -> o));
    }
}
