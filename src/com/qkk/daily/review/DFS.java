package com.qkk.daily.review;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName DFS.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月02日 14:33:39
 */
public class DFS {
    public static void getDfs(String[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] gos = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
        Set<String> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i > 0 && i < m - 1) && (j > 0 && j < n - 1)) {
                    continue;
                }
                if (matrix[i][j].equals("X")) {
                    continue;
                }
                if (!set.contains(i + "-" + j)) {
                    set.add(i + "-" + j);
                    List<int[]> enter = new ArrayList<>();
                    enter.add(new int[]{i, j});
                    int count = getDfs(matrix, i, j, gos, 1, set, enter);
                    if (enter.size() == 1) {
                        System.out.println(count);
                    }
                }
            }
        }
    }

    private static int getDfs(String[][] matrix, int i, int j, int[][] gos, int count, Set<String> set, List<int[]> enter) {
        for (int[] go: gos) {
            int newX = i + go[0];
            int newY = j + go[1];
            if (newX < 0 || newX >= matrix.length || newY < 0 || newY >= matrix[0].length || matrix[newX][newY].equals("X")) {
                continue;
            }
            if (set.contains(newX + "-" + newY)) {
                continue;
            }
            set.add(newX + "-" + newY);
            if (newX == 0 || newX == matrix.length - 1 || newY == 0 || newY == matrix[0].length - 1) {
                enter.add(new int[]{newX, newY});
                return count;
            }
            count = getDfs(matrix, newX, newY, gos, count + 1, set, enter);
        }
        return count;
    }

    public static void main(String[] args) {
        String[][] matrix = {
                {"X", "X", "X", "X"},
                {"X", "O", "O", "O"},
                {"X", "X", "X", "X"},
                {"X", "X", "X", "X"},
                {"X", "X", "X", "O"}
        };
        getDfs(matrix);
    }
}
