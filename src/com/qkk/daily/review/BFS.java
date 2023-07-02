package com.qkk.daily.review;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName BFS.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月02日 16:09:24
 */
public class BFS {
    public static void getBfs(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        LinkedList<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int[][] gos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            if (matrix[poll[0]][poll[1]] == 1) {
                break;
            }
            for (int[] go: gos) {
                int newX = poll[0] + go[0];
                int newY = poll[1] = go[0];
                if (newX < 0 || newX >= m || newY < 0 || newY >= n || matrix[newX][newY] != 0) {
                    continue;
                }
                matrix[newX][newY] = matrix[poll[0]][poll[1]] - 1;
                queue.add(new int[]{newX, newY});
            }
        }
    }
    public static void main(String[] args) {

    }
}
