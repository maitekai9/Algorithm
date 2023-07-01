package com.qkk.daily.design.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StrategyFactory.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 21:55:31
 */
public class StrategyFactory {
    private static final Map<String, Strategy> STRATEGY_MAP = new HashMap<>();
    static {
        STRATEGY_MAP.put("A", new StrategyA());
        STRATEGY_MAP.put("B", new StrategyB());
    }

    public Map<Long, Integer> parse(String type, String s) {
        return STRATEGY_MAP.get(type).parseParam(s);
    }
}
