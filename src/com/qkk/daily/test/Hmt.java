package com.qkk.daily.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Hmt.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月16日 08:59:20
 */
public class Hmt {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        boolean flag = list.stream().anyMatch(it -> !it.equals(2));
        System.out.println(flag);
    }
}
