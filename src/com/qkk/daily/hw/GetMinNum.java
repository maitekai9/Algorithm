package com.qkk.daily.hw;

import java.util.*;

/**
 * @ClassName GetMinNum.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月10日 13:45:21
 */
public class GetMinNum {
    public static void main(String[] args) {
        String s = "5,21";
        String[] split = s.split(",");
        List<String> list = Arrays.asList(split);
        List<String> res = new ArrayList<>();
        int n = 2;
        boolean[] used = new boolean[split.length];
        ArrayDeque<String> deque = new ArrayDeque<>();
        dfs(list, 0, deque, n, used, res);
        res.sort(Comparator.comparingInt(Integer::parseInt));
        System.out.println(Arrays.toString(res.toArray(new String[0])));
    }

    private static void dfs(List<String> list, int i, ArrayDeque<String> deque, int n, boolean[] used, List<String> res) {
        if (deque.size() == n) {
            StringBuilder sb = new StringBuilder();
            ArrayList<String> tem = new ArrayList<>(deque);
            for (String s: tem) {
                sb.append(s);
            }
            res.add(sb.toString());
            return;
        }
        for (int j = 0; j < list.size(); j++) {
            if (used[j]) {
                continue;
            }
            used[j] = true;
            deque.push(list.get(j));
            dfs(list, i + 1, deque, n, used, res);
            deque.pop();
            used[j] = false;
        }
    }
}
