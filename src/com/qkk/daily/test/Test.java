package com.qkk.daily.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Test.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月21日 22:58:14
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
//        map.put("1", "1");
//        System.out.printf("%04d", 25);
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(in.readLine());
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.remove("1");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
    }
}
