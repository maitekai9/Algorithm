package com.qkk.daily.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CodeC.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年06月29日 22:04:30
 */
public class CodeC {

    Map<Integer, String> database = new HashMap<>();

    private int id;

    public String encode(String longUrl) {
        id++;
        database.put(id, longUrl);
        return "http://tinyurl.com/" + id;
    }

    public String decode(String shortUrl) {
        String id = shortUrl.substring(shortUrl.lastIndexOf("/") + 1);
        return database.get(Integer.parseInt(id));
    }

    public void haha(Integer i, String s) {

    }

    public void haha(String s, Integer i) {

    }

}
