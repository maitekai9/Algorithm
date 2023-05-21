package com.qkk.daily.algorithm;

import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CircularPermutation.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月23日 21:21:49
 */
public class CircularPermutation {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> res = new ArrayList<>();
        res.add(start);
        for (int i = 1;i <= n; i++) {
            int m = res.size();
            for (int j = m - 1; j >= 0 ; j--) {
                res.add((res.get(j) ^ start) | ((1 << (i - 1)) ^ start));
            }
        }
        return res;
    }
}
