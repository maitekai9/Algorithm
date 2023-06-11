package com.qkk.daily.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName SearchFriend.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月10日 13:36:07
 */
public class SearchFriend {
    public static void main(String[] args) {
        String s = "95 96 97 98 99 101 102 103 104 105";
        String[] s1 = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s2: s1) {
            list.add(Integer.parseInt(s2));
        }
        list.sort(Comparator.comparingInt(o -> Math.abs(o - 100)));
        System.out.println(Arrays.toString(list.toArray(new Integer[0])));
    }
}
