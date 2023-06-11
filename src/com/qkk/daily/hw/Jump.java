package com.qkk.daily.hw;

import java.util.*;

/**
 * @ClassName Jump.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月10日 08:28:03
 */
public class Jump {
    public static final int STATUS_UN = 0;
    public static final int STATUS_DO = 1;
    public static final int STATUS_DID = 2;
    public static void main(String[] args) {
        int n = 6;
        String s = "";
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            map.put(i, new ArrayList<>());
        }
        String[] s1 = s.split(" ");
        for (String s2: s1) {
            Integer pre = Integer.parseInt(String.valueOf(s2.charAt(0)));
            map.get(pre).add(Integer.parseInt(String.valueOf(s2.charAt(1))));
        }
        for (Map.Entry<Integer, List<Integer>> cur: map.entrySet()) {
            System.out.println(cur.getKey());
            System.out.println(Arrays.toString(cur.getValue().toArray(new Integer[0])));
        }
        int[] status = new int[n];
        boolean[] flag = {true};
        for (int i = 0; i < n && flag[0]; i++) {
            if (status[i] == STATUS_UN) {
                bfs(map, i, flag, status);
            }
        }
        System.out.println(flag[0]);
    }

    private static void bfs(Map<Integer, List<Integer>> map, int i, boolean[] flag, int[] status) {
        status[i] = STATUS_DO;
        for (int j: map.get(i)) {
            if (status[j] == STATUS_UN) {
                bfs(map, j, flag, status);
                if (!flag[0]) {
                    return;
                }
            } else if (status[j] == STATUS_DO) {
                flag[0] = false;
                return;
            }
        }
        status[i] = STATUS_DID;
    }
}
