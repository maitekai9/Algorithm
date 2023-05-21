package com.qkk.daily.algorithm;

/**
 * @ClassName FractionAddition.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月28日 22:54:37
 */
public class FractionAddition {
    public String fractionAddition(String expression) {
        long high = 0, low = 1;
        int index = 0, n = expression.length();
        while (index < n) {
            long high1 = 0, sign = 1;
            if (expression.charAt(index) == '-' || expression.charAt(index) == '+') {
                sign = expression.charAt(index) == '-' ? -1 : 1;
                index++;
            }
            while (index < n && Character.isDigit(expression.charAt(index))) {
                high1 = high1 * 10 + expression.charAt(index) - '0';
                index++;
            }
            high1 *= sign;
            index++;
            long low1 = 0;
            while (index < n && Character.isDigit(expression.charAt(index))) {
                low1 = low1 * 10 + expression.charAt(index) - '0';
                index++;
            }
            high = high * low1 + high1 * low;
            low  *= low1;
        }
        if (high == 0) {
            return "0/1";
        }
        long common = getCommon(Math.abs(high), low);
        return high / common + "/" + low / common;
    }

    private long getCommon(long abs, long low) {
        long remain = abs % low;
        while (remain != 0) {
            abs = low;
            low = remain;
            remain = abs % low;
        }
        return low;
    }
}
