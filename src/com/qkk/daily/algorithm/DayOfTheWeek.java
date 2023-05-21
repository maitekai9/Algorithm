package com.qkk.daily.algorithm;
/**
 * @ClassName DayOfTheWeek.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年01月03日 08:40:31
 */
public class DayOfTheWeek {
    private final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public String dayOfTheWeek(int day, int month, int year) {
        int cur = 0;
        for (int i = 1971; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                cur += 1;
            }
        }
        cur += (year - 1971) * 365;
        for (int i = 0; i < month - 1; i++) {
            cur += days[i];
        }
        cur += day;
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month > 2) {
            cur += 1;
        }
        return weeks[(cur + 3) % 7];
    }
}
