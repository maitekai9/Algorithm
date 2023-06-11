package com.qkk.daily.hw;

import java.util.*;

/**
 * @ClassName GetMinDst.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月09日 21:04:30
 */
public class GetMinDst {
    public static void main(String[] args) {
        int m = 3, n = 3;
        String s ="022 121 221";
        int[][] matrix = new int[m][n];
        String[] split = s.split(" ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(String.valueOf(split[i].charAt(j)));
            }
        }
        for (int[] i: matrix) {
            System.out.println(Arrays.toString(i));
        }
        List<Integer> times = new ArrayList<>();
        boolean[][] used = new boolean[m][n];
        used[0][0] = true;
        int[][] gos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        dfs(matrix, 0, 0, Integer.MIN_VALUE, 0, gos, used, times);
        System.out.println(Collections.min(times));
    }

    private static void dfs(int[][] matrix, int i, int j, int last, int time, int[][] gos, boolean[][] used, List<Integer> times) {
        int cur = matrix[i][j];
        int dec = cur == last ? 1 : 0;
        if (i == matrix.length - 1 && j == matrix[0].length - 1) {
            time += cur - dec;
            times.add(time);
            return;
        }
        for (int[] go: gos) {
            int nextI = i + go[0];
            int nextJ = j + go[1];
            if (nextI < 0 || nextI >= matrix.length || nextJ < 0 || nextJ >= matrix[0].length) {
                continue;
            }
            if (used[nextI][nextJ]) {
                continue;
            }
            used[nextI][nextJ] = true;
            dfs(matrix, nextI, nextJ, cur, time + cur - dec, gos, used, times);
            used[nextI][nextJ] = false;
        }
    }
}
