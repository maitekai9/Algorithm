package com.qkk.daily.algorithm;

/**
 * @ClassName InterPret.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月06日 21:00:38
 */
public class Interpret {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char cur = command.charAt(i);
            if (cur == 'G') {
                sb.append(cur);
            } else if (cur =='(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                } else {
                    sb.append("al");
                }
            }
        }
        return sb.toString();
    }
}
