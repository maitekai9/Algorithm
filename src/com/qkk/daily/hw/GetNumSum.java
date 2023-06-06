package com.qkk.daily.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName GetNumSum.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月05日 22:35:01
 */
public class GetNumSum {
    public static void getSum() {
        String s = "abcd12bb34";
        int n = s.length();
        int left = 0;
        int right = 0;
        int max = - 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char cur = s.charAt(i);
            if (Character.isLetter(cur)) {
                list.add(i);
                if (list.size() > 1) {
                    left = list.remove(0) + 1;
                }
                if (left == right) {
                    right++;
                    continue;
                }
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        getSum();
    }
}
