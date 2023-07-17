package com.qkk.daily.test;


import com.sun.deploy.util.StringUtils;

import javax.imageio.stream.ImageInputStream;
import java.util.*;

/**
 * @author QKK
 * @date 2023年07月17日 10:04
 */
public class TestForZX {
    public static void getResult(String s) {
        char[] chars = s.toCharArray();
        List<Integer> digit = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        int flag = 1;
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (i == 0) {
                store(i , digit, map, flag, chars);
            }else if (cur == '=') {
                flag = -1;
                store(i + 1, digit, map, flag, chars);
            } else if (cur == '+') {
                store(i + 1, digit, map, flag, chars);
            } else if (cur == '-') {
                store(i + 1, digit, map, -flag, chars);
            }
        }
        System.out.println(Arrays.toString(digit.toArray(new Integer[0])));
        for (Map.Entry<String, List<Integer>> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(Arrays.toString(entry.getValue().toArray(new Integer[0])));
        }
        int digitNum = 0;
        for (Integer i: digit) {
            digitNum += i;
        }
        System.out.println(digitNum);

        String var = null;
        int varNum = 0;
        for (Map.Entry<String, List<Integer>> entry: map.entrySet()) {
            var = entry.getKey();
            for (Integer i: entry.getValue()) {
                varNum += i;
            }
        }
        System.out.println(var);
        System.out.println(varNum);
        if (digitNum == 0 && varNum == 0) {
            System.out.println("方程无限解");
        } else if (digitNum != 0 && varNum == 0) {
            System.out.println("方程无解");
        } else {
            System.out.println(var + "=" + (-digitNum / varNum));
        }
    }

    private static void store(int i,
                              List<Integer> digit,
                              Map<String, List<Integer>> map,
                              int i1,
                              char[] chars) {
        boolean flag = true;
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int j = i; j < chars.length; j++) {
            char cur = chars[j];
            if (cur == '=' || cur == '+' || cur == '-') {
                break;
            }
            deque.push(cur);
        }
        int number = 0;
        int prefix = 1;
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
            if (!map.containsKey(var)) {
                map.put(var, new ArrayList<>());
            }
            map.get(var).add(num);
        } else {
            digit.add(num);
        }
    }

    public static void main(String[] args) {
//        getResult("2a+6-2+a=8+2a-2");
//        getResult("a=1");
        getResult("1+abc=2+2abc+1");
    }
}
