package com.qkk.daily.algorithm;

/**
 * @ClassName ScoreOfParentheses.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月09日 20:53:25
 */
public class ScoreOfParentheses {
    int idx = 0;
    public int scoreOfParentheses(String s) {
        int res = 0;
        while (idx < s.length() && s.charAt(idx) == '(') {
            idx++;
            if (s.charAt(idx) == ')') {
                res++;
            } else {
                res += scoreOfParentheses(s) * 2;
            }
            idx++;
        }
        return res;
    }
}
