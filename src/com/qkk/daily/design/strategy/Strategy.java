package com.qkk.daily.design.strategy;

import java.util.Map;

/**
 * @ClassName Strategy.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 21:48:45
 */
public interface Strategy {
    Map<Long, Integer> parseParam(String s);
}
