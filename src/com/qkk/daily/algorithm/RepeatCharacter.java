package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName RepeatCharacter.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月06日 23:09:07
 */
public class RepeatCharacter {
    public int repeatChar(String s) {
        int n = s.length();
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0;i < n; i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new ArrayList<>());
                map.get(c).add(-1);
            }
            map.get(c).add(i);
        }
        int res = 0;
        for (Map.Entry<Character, List<Integer>> entry: map.entrySet()) {
            List<Integer> cur = entry.getValue();
            cur.add(n);
            int size = cur.size();
            for (int i = 1; i < size - 1; i++) {
                res += (cur.get(i) - cur.get(i - 1)) * (cur.get(i + 1) - cur.get(i));
            }
        }
        return res;
    }
}
