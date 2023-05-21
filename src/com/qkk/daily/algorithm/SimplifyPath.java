package com.qkk.daily.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName SimplifyPath.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年01月06日 20:09:56
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] splits = path.split("/");
        Deque<String> list = new ArrayDeque<>();
        for (String s: splits) {
            if (s.equals("..")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                }
            } else if (s.length()>0 && !s.equals(".")) {
                list.offerLast(s);
            }
        }
        StringBuilder res = new StringBuilder();
        if (list.isEmpty()) {
            res.append("/");
        } else {
            while (!list.isEmpty()) {
                res.append("/");
                res.append(list.removeFirst());
            }
        }
        return res.toString();
    }
}
