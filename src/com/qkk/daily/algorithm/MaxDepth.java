package com.qkk.daily.algorithm;

/**
 * @ClassName MaxDepth.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年01月07日 19:58:19
 */
public class MaxDepth {
    public int maxDepth(String s) {
        int res = 0, size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                size++;
                res = Math.max(res, size);
            } else if (s.charAt(i) == ')') {
                size--;
            }
        }
        return res;
    }
}
