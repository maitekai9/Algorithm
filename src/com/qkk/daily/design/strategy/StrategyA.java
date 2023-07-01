package com.qkk.daily.design.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StrategyA.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 21:50:26
 */
public class StrategyA implements Strategy{
    @Override
    public Map<Long, Integer> parseParam(String s) {
        Map<Long, Integer> res = new HashMap<>();
        String[] split = s.split(",");
        for (String sp: split) {
            String[] split1 = sp.split(":");
            res.put(Long.getLong(split1[0]), Integer.parseInt(split1[1]));
        }
        return res;
    }
}
