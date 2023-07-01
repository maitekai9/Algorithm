package com.qkk.daily.design.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StrategyB.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 21:53:15
 */
public class StrategyB implements Strategy{
    @Override
    public Map<Long, Integer> parseParam(String s) {
        String[] split = s.split(":");
        Map<Long, Integer> res = new HashMap<>();
        res.put(Long.getLong(split[0]), Integer.parseInt(split[1]));
        return res;
    }
}
