package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MovingAverage.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月16日 07:57:38
 */
public class MovingAverage {
    int size;
    List<Integer> list;
    public MovingAverage(int size) {
        this.size = size;
        list = new ArrayList<>();
    }

    public double next(int val) {
        list.add(val);
        int length = list.size();
        int sum = 0;
        if (length < size) {
            for (Integer integer : list) {
                sum += integer;
            }
            return (double) sum / length;
        }
        for (int i = length - size; i < length; i++) {
            sum += list.get(i);
        }
        return (double) sum / size;
    }
}
