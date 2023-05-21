package com.qkk.daily.algorithm;

/**
 * @ClassName SpecialIndex.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月04日 08:52:23
 */
public class SpecialIndex {
    public int countSpecialIndex(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] rows = new int[row];
        int[] cols = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rows[i] += mat[i][j];
                cols[j] += mat[i][j];
            }
        }
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1) {
                    res += 1;
                }
            }
        }
        return res;
    }
}
