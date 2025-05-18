package org.milan.algorithm.backtracking;

/**
 * @author Milan Rathod
 */
public class Sudoku {
    public void solve(char[][] board) {
        solveRecursive(board, 0, 0);
    }

    private boolean solveRecursive(char[][] board, int row, int column) {
        if (row == 8 && column == 9) {
            return true;
        }

        if (column == 9) {
            row++;
            column = 0;
        }

        if (board[row][column] != '.') {
            return solveRecursive(board, row, column + 1);
        }

        for (char num = '1'; num <= '9'; num++) {
            if (isValid(board, row, column, num)) {
                board[row][column] = num;
                if (solveRecursive(board, row, column + 1)) {
                    return true;
                } else {
                    board[row][column] = '.';
                }
            }
        }

        return false;
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int rowStart = (row / 3) * 3;
        int colStart = (col / 3) * 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
