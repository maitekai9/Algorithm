package com.qkk.daily.algorithm;

/**
 * @ClassName FindNumberIn2DArray.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月13日 22:48:09
 */
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] cur : matrix) {
            int l = 0, r = cur.length;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (cur[mid] > target) {
                    r = mid;
                } else if (cur[mid] < target) {
                    l = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
