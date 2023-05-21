package com.qkk.daily.algorithm;

/**
 * @ClassName PrevPermOpt.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年04月03日 21:08:08
 */
public class PrevPermOpt {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        for (int i = n - 2; i >= 0 ; i--) {
            if (arr[i] > arr[i + 1]) {
                int j = n - 1;
                while (arr[j] >= arr[i] || arr[j] == arr[j - 1]) {
                    j--;
                }
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                break;
            }
        }
        return arr;
    }
}
