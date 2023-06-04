package com.qkk.daily.ncoder;

import java.util.Arrays;

/**
 * @ClassName Biscuit.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月04日 13:10:28
 */
public class Biscuit {
    public int biscuit(int[] appetite, int[] biscuit) {
        Arrays.sort(appetite);
        Arrays.sort(biscuit);
        int count = 0;
        int index = biscuit.length - 1;
        for (int i = appetite.length - 1; i >= 0 ; i--) {
            if (index >= 0 && biscuit[index] >= appetite[i]) {
                count++;
                index--;
            }
        }
        return count;
    }
}
