package com.qkk.daily.hw;

import java.util.*;

/**
 * @ClassName GetMinDst1.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月10日 19:57:34
 */
public class GetMinDst1 {
    public static void main(String[] args) {
        String s = "1,2,11 2,3,13 1,3,50";
        String[] s1 = s.split(" ");
        Map<String, List<int[]>> map = new HashMap<>();
        for (String s2: s1) {
            String[] split = s2.split(",");
            if (!map.containsKey(split[0])) {
                map.put(split[0], new ArrayList<>());
            }
            map.get(split[0]).add(new int[]{Integer.parseInt(split[1]), Integer.parseInt(split[2])});
        }
        int src = 1;
        int dst = 3;
        List<Integer> res = new ArrayList<>();
        dfs(map, src, dst, 0, res);
        System.out.println(Arrays.toString(res.toArray(new Integer[0])));
    }

    private static void dfs(Map<String, List<int[]>> map, int src, int dst, int sum, List<Integer> res) {
        if (src == dst) {
            res.add(sum);
            return;
        }
        for (int[] i: map.get(String.valueOf(src))) {
            dfs(map, i[0], dst, sum + i[1], res);
        }
    }
}
