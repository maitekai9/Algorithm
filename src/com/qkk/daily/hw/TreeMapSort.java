package com.qkk.daily.hw;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @ClassName TreeMapSort.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月10日 14:23:43
 */
public class TreeMapSort {
    public static void main(String[] args) {
        String s = "xyxyyXXX";
        Map<Character, int[]> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, new int[]{c, 1});
            }
            map.get(c)[1]++;
        }
        List<int[]> values = (List<int[]>) map.values();
        Collections.sort(values, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o2[0] - o1[0];
            } else {
                return o2[1] - o1[1];
            }
        });
        for (int[] i: values) {
            System.out.println(Arrays.toString(i));
        }
    }
}
