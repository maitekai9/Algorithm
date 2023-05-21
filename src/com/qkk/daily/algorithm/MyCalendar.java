package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyCalendar.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月05日 22:29:39
 */
public class MyCalendar {
    List<int[]> booked;

    public MyCalendar() {
        booked = new ArrayList<>();
    }
    public boolean book(int start, int end) {
        for (int[] arr: booked) {
            int l = arr[0], r = arr[1];
            if (start < r && l < end) {
                return false;
            }
        }
        booked.add(new int[]{start, end});
        return true;
    }
}
