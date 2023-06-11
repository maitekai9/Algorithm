package com.qkk.daily.hw;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @ClassName GoRun.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月09日 22:56:19
 */
public class GoRun {
    public static void main(String[] args) {
        int n = 4, m = 4;
        int[][] matrix = new int[4][4];
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        queue.add(new int[]{3, 3});
        matrix[0][0] = 1;
        matrix[3][3] = 1;
        int count = n * m - 2;
        int[][] gos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int max = 0;
        while (!queue.isEmpty() && count > 0) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            max = matrix[x][y] + 1;
            for (int[] go: gos) {
                int newX = x + go[0];
                int nexY = y + go[1];
                if (newX < 0 || newX >= n || nexY < 0 || nexY >= m) {
                    continue;
                }
                if (matrix[newX][nexY] == 0) {
                    matrix[newX][nexY] = max;
                    queue.add(new int[]{newX, nexY});
                    count--;
                }
            }
        }
        System.out.println(max - 1);
    }
}
