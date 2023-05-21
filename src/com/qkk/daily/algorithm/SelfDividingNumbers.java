package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SelfDividingNumbers.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年03月31日 20:39:22
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            if (selfDividingNumber(i)) {
                res.add(i);
            }
        }
        return res;
    }

    public boolean selfDividingNumber(int number) {
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || number % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
