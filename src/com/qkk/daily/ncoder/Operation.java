package com.qkk.daily.ncoder;

import java.util.Stack;

/**
 * @ClassName Operation.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月17日 23:18:08
 */
public class Operation {
    public static int getNum(String str) {
        Stack<Integer> stack = new Stack<>();
        stack.push(str.charAt(0) - '0');
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);
            switch (cur) {
                case '+':
                    stack.push(stack.pop() + (str.charAt(++i) - '0'));
                    break;
                case '-':
                    stack.push(stack.pop() - (str.charAt(++i) - '0'));
                    break;
                case '*':
                    stack.push(stack.pop() * (str.charAt(++i) - '0'));
                    break;
                case '/':
                    stack.push(stack.pop() / (str.charAt(++i) - '0'));
                    break;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(getNum("2+3-4"));
    }
}
