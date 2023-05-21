package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AmbiguousCoordinates.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月07日 22:38:08
 */
public class AmbiguousCoordinates {
    public List<String> ambiguousCoordinates(String s) {
        int n = s.length();
        s = s.substring(1, n - 1);
        List<String> res = new ArrayList<>();
        for (int i = 1; i < s.length() - 1; i++) {
            List<String> ls = getStrList(s.substring(0, i));
            if (ls.isEmpty()) {
                continue;
            }
            List<String> rs = getStrList(s.substring(i));
            if (rs.isEmpty()) {
                continue;
            }
            for (String s1: ls) {
                for (String s2: rs) {
                    res.add("(" + s1 + "," + s2 + ")");
                }
            }
        }
        return res;
    }

    public List<String> getStrList(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() == 1 || s.charAt(0) != '0') {
            res.add(s);
        }
        for (int i = 1; i < s.length() ; i++) {
            String s1 = s.substring(0, i), s2 = s.substring(i);
            if ((s1.length() == 1 || s1.charAt(0) != '0') && s2.charAt(s2.length() - 1) != '0') {
                res.add(s1 + "." + s2);
            }
        }
        return res;
    }
}
