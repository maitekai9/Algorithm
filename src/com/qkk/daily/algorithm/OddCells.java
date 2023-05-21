package com.qkk.daily.algorithm;

/**
 * @ClassName OddCells.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月12日 20:20:59
 */
public class OddCells {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int[] indice: indices) {
            for (int i = 0; i < n; i++) {
                matrix[indice[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][indice[1]]++;
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
