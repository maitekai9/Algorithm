package com.qkk.daily.ncoder;

/**
 * @ClassName MaxRatio.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月20日 22:59:58
 */
public class MaxRatio {
    public String getMaxRatio(String str, int n) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'G' || str.charAt(i) == 'C') {
                max++;
            }
        }
        int i = 1, j = n, count = max;
        while (j < str.length()) {
            if (str.charAt(i) == 'G' || str.charAt(i) == 'C') {
                count--;
            }
            if (str.charAt(j) == 'G' || str.charAt(j) == 'C') {
                count++;
            }
            if (count > max) {
                max = count;
                index = i;
            }
            i++;
            j++;
        }
        return str.substring(index, index + n);
    }
}
