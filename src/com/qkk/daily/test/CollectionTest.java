package com.qkk.daily.test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName CollectionTest.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月12日 10:38:05
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.get(0);
        LinkedList<Integer> link = new LinkedList<>();
        link.add(1);
        link.get(0);
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.get(0);
        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
        copy.add(1);
        copy.get(0);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.remove(1);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.remove(1);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.remove(1);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.get("1");
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, 1);
        linkedHashMap.get(1);

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        treeMap.get(1);
    }
}
