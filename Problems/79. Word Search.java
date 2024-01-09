/*
Problem Link: https://leetcode.com/problems/word-search/
*/

import java.util.*;

class Solution {
    private boolean dfs(char[][] board, int i, int j, String word, int index) {
        if (index == word.length())
            return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
            return false;
        if (board[i][j] != word.charAt(index))
            return false;

        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = dfs(board, i + 1, j, word, index + 1) ||
                dfs(board, i - 1, j, word, index + 1) ||
                dfs(board, i, j + 1, word, index + 1) ||
                dfs(board, i, j - 1, word, index + 1);
        board[i][j] = temp;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {

                if (board[i][j] == word.charAt(0) && dfs(board, i, j, word, 0))
                    return true;
            }
        return false;
    }
}