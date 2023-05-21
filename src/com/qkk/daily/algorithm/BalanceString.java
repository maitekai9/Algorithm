package com.qkk.daily.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BalanceString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月13日 21:55:14
 */
public class BalanceString {
    public int balanceString(String s) {
        int len = s.length();
        int[] cur = new int[26];
        char ch;
        for (int i = 0; i < len; i++) {
            ch = s.charAt(i);
            cur[ch - 'A']++;
        }
        int avg = len / 4;
        if (check(cur, avg)) {
            return 0;
        }
        int left = 0, right = 0, res = len;
        while (left < len) {
            if (check(cur, avg)) {
                res = Math.min(res, right - left);
                cur[s.charAt(left++) - 'A']++;
            } else if (right < len - 1) {
                cur[s.charAt(right++) - 'A']--;
            } else {
                break;
            }
        }
        return res;
    }

    public boolean check(int[] cur, int avg) {
        return cur['Q' - 'A'] <= avg &&
                cur['W' - 'A'] <= avg &&
                cur['E' - 'A'] <= avg &&
                cur['R' - 'A'] <= avg;
    }
}
