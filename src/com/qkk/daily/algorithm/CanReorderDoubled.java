package com.qkk.daily.algorithm;

import java.util.*;

/**
 * @ClassName CanReorderDoubled.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年04月01日 20:35:24
 */
public class CanReorderDoubled {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if (map.getOrDefault(0, 0) % 2 != 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(Comparator.comparingInt(Math::abs));
        for (int val: list) {
            if (map.getOrDefault(2 * val, 0) < map.get(val)) {
                return false;
            }
            map.put(2 * val, map.getOrDefault(2 * val, 0) - map.get(val));
        }
        return true;
    }
}
