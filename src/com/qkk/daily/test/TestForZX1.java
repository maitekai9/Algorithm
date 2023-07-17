package com.qkk.daily.test;

import java.util.*;

/**
 * @author QKK
 * @date 2023年07月17日 10:04
 */
public class TestForZX1 {
    public static void getResult(String s) {
        char[] chars = s.toCharArray();
        // 常数项和
        int[] digit = new int[1];
        // key=变量，value=因数和
        Map<String, Integer> map = new HashMap<>();
        // 转化为ax + b = 0，flag转换符号
        int flag = 1;
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (i == 0 && Character.isLetterOrDigit(cur)) {
                i = store(i , digit, map, flag, chars);
            }else if (cur == '=') {
                flag = -1;
                i = store(i + 1, digit, map, flag, chars);
            } else if (cur == '+') {
                i = store(i + 1, digit, map, flag, chars);
            } else if (cur == '-') {
                i = store(i + 1, digit, map, -flag, chars);
            }
        }
        // 常数项和
        int digitNum = digit[0];
        System.out.println(digitNum);
        // 变量
        String var = null;
        // 因数和
        int varNum = 0;
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            var = entry.getKey();
            varNum = entry.getValue();
        }
        System.out.println(var);
        System.out.println(varNum);
        // 0=0
        if (digitNum == 0 && varNum == 0) {
            System.out.println("方程无限解");
        // 2x=1+2x
        } else if (digitNum != 0 && varNum == 0) {
            System.out.println("方程无解");
        // ax=b
        } else {
            System.out.println(var + "=" + (-digitNum / varNum));
        }
    }

    private static int store(int i,
                              int[] digit,
                              Map<String, Integer> map,
                              int i1,
                              char[] chars) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for ( ; i < chars.length; i++) {
            char cur = chars[i];
            if (cur == '=' || cur == '+' || cur == '-') {
                break;
            }
            deque.push(cur);
        }
        // 数字项
        int number = 0;
        int prefix = 1;
        // 变量
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            char cur = deque.poll();
            if (Character.isLetter(cur)) {
                sb.append(cur);
            } else {
                number += Integer.parseInt(String.valueOf(cur)) * prefix;
                prefix *= 10;
            }
        }
        String var = sb.reverse().toString();
        int num = i1 * (number == 0 ? 1 : number);
        if (var.length() != 0) {
            map.put(var, map.getOrDefault(var, 0) + num);
        } else {
            digit[0] += num;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        getResult("1=1");
        getResult("2x=1+2x");
        getResult("2a+6-2+a=8+2a-2");
        getResult("a=1");
        getResult("abc+1+2abc=2+2abc+1");
    }
}
