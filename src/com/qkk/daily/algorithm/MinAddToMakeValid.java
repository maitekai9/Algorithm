package com.qkk.daily.algorithm;

/**
 * @ClassName MinAddToMakeValid.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月04日 14:41:12
 */
public class MinAddToMakeValid {
    public int minAddToMakeValid(String s) {
        int ans = 0, tem = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(') {
                tem++;
            } else {
                if (tem > 0) {
                    tem--;
                } else {
                    ans++;
                }
            }
        }
        ans += tem;
        return ans;
    }
}
