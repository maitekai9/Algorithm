package com.qkk.daily.algorithm;

/**
 * @ClassName Largest1BorderedSquare.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月17日 21:52:54
 */
public class Largest1BorderedSquare {
    public int largest1BorderedSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][][] count = new int[m + 1][n + 1][2];
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                if (grid[i - 1][j - 1] == 1) {
                    count[i][j][0] = count[i][j - 1][0] + 1;
                    count[i][j][1] = count[i - 1][j][1] + 1;
                }
            }
        }
        int res = 0;
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = Math.min(count[i][j][0], count[i][j][1]); k >= 1 ; k--) {
                    if (count[i - k + 1][j][0] >= k && count[i][j - k + 1][1] >= k) {
                        res = Math.max(res, k);
                        break;
                    }
                }
            }
        }
        return res;
    }
}
