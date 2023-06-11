package com.qkk.daily.hw;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName TestValue.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月10日 00:57:21
 */
public class TestValue {
    public static void change(boolean[] flag) {
        flag[0] = !flag[0];
        System.out.println(flag[0]);
    }
    public static void main(String[] args) {
        String s = "21,30,62,5,31";
        String[] split = s.split(",");
        List<String> res = Arrays.asList(split);
        res.sort((o1, o2) -> (o1 + o1).compareTo(o1 + o2));
        System.out.println(Arrays.toString(res.toArray(new String[0])));
    }
}
