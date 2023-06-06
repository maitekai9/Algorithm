package com.qkk.daily.ncoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GetSpecial.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月06日 21:35:37
 */
public class GetSpecial {
    public static void getSpecial() {
        List<Integer> list = new ArrayList<>();
        int k = 3;
        int left = 0, right = 0;
        List<Integer> res = new ArrayList<>();
        while (right < list.size()) {
            int diff = list.get(right) - list.get(left) - (right - left);
            if (diff > k) {
                left++;
            } else {
                if (diff == k) {
                    res.add(list.get(right) - list.get(left) + 1);
                }
                right++;
            }
        }
    }
}
