package com.qkk.daily.algorithm;

/**
 * @ClassName MinArray.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月16日 21:59:13
 */
public class MinArray {
    public int minArray(int[] numbers) {
        int res = Integer.MAX_VALUE;
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            if (numbers[i] > res) {
                break;
            }
            res = numbers[i];
        }
        return res;
    }

    public int minArray1(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}
