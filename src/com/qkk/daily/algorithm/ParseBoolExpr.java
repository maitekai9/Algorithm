package com.qkk.daily.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName ParseBoolExpr.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月05日 08:27:47
 */
public class ParseBoolExpr {
    public boolean parseBoolExpr(String expression) {
        Deque<Character> deque = new ArrayDeque<>();
        int n = expression.length();
        for (int i = 0; i < n; i++) {
            char cur = expression.charAt(i);
            if (cur == ',') {
                continue;
            } else if (cur != ')') {
                deque.push(cur);
            } else {
                int t = 0, f = 0;
                while (deque.peek() != '(') {
                    char tem = deque.pop();
                    if (tem == 't') {
                        t++;
                    } else {
                        f++;
                    }
                }
                deque.pop();
                char sign = deque.pop();
                switch (sign) {
                    case '!':
                        deque.push(t == 1 ? 'f' : 't');
                        break;
                    case '&':
                        deque.push(f == 0 ? 't' : 'f');
                        break;
                    case '|':
                        deque.push(t > 0 ? 't' : 'f');
                        break;
                    default:
                }
            }
        }
        return deque.pop() == 't';
    }
}
