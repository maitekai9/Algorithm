package com.qkk.daily.algorithm;

/**
 * @ClassName ExistWord.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月18日 12:45:27
 */
public class ExistWord {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] flag = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(i, j, board, flag, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int x, int y, char[][] board, boolean[][] flag, String word, int k) {
        if (board[x][y] != word.charAt(k)) {
            return false;
        } else if (k == word.length() - 1){
            return true;
        }
        flag[x][y] = true;
        int[][] go = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] ints : go) {
            int newX = x + ints[0], newY = y + ints[1];
            if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[0].length) {
                if (!flag[newX][newY] && dfs(newX, newY, board, flag, word, k + 1)) {
                    result = true;
                    break;
                }
            }

        }
        flag[x][y] = false;
        return result;
    }
}
