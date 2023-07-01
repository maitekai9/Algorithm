package com.qkk.daily.hw;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName HotelPrice.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月13日 21:34:43
 */
public class HotelPrice {
    public static void main(String[] args) {
        String s = "1 2 3 4 5 6 7 8 9 10";
        int n = 10, k = 5, x = 6;
        String[] arr = s.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(o -> Math.abs(Integer.parseInt(o) - x)));
        System.out.println(Arrays.toString(arr));
    }
}
