package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GrayCode.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年01月08日 21:26:45
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            res.add(i >> 1 ^ i);
        }
        return res;
    }
}
