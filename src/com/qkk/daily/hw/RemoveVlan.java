package com.qkk.daily.hw;

import java.util.*;

/**
 * @ClassName RemoveVlan.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月05日 21:12:55
 */
public class RemoveVlan {

    public static void removeVlan() {
        String s = "20-21,15,18,30,5-10";
        int target = 6;
        String[] split = s.split(",");
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (String s1: split) {
            if (s1.contains("-")) {
                String[] split1 = s1.split("-");
                map.put(Integer.parseInt(split1[0]), Integer.parseInt(split1[1]));
            } else {
                map.put(Integer.parseInt(s1), 0);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) > target) {
                right = mid - 1;
            } else if (list.get(mid) < target){
                left = mid + 1;
            } else {
                break;
            }
        }
        int start = list.get(left) == target ? list.get(left) : list.get(left - 1);
        int cur = map.get(start);
        map.remove(start);
        if (cur != 0) {
            if (cur == start + 1) {
                if (cur == target) {
                    map.put(start, 0);
                } else {
                    map.put(cur, 0);
                }
            } else {
                if (cur == target) {
                    map.put(start, cur - 1);
                } else if (start == target){
                    map.put(start + 1, cur);
                } else {
                    map.put(start, target - 1);
                    map.put(target + 1, cur);
                }
            }
        }
    }

    public static void main(String[] args) {
        //removeVlan();
        List<int[]> list = new ArrayList<>();
        Collections.sort(list, Comparator.comparingInt(o -> o[0]));
    }
}
