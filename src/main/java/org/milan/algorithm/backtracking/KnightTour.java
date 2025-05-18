package org.milan.algorithm.backtracking;

import java.util.Arrays;

/**
 * Problem: The knight's tour problem
 * <p>
 * refer {@link @<a href="https://www.geeksforgeeks.org/the-knights-tour-problem-backtracking-1/">...</a>}
 *
 * @author Milan Rathod
 */
public class KnightTour {

    /**
     * Solve knight tour problem using backtracking
     *
     * @param n size of the chessboard (n x n)
     * @return solution matrix with the sequence of knight's moves
     * or {{-1}} if no solution exists
     */
    public int[][] solve(int n) {
        int[][] solution = new int[n][n];

        // Initialization of solution matrix
        for (int[] row : solution) {
            Arrays.fill(row, -1);
        }

        // xMove and yMove defined next move of knight
        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};

        // Knight will initially starts from 0
        solution[0][0] = 0;

        if (!explore(0, 0, 1, n, solution, xMove, yMove)) {
            return new int[][]{{-1}};
        } else {
            return solution;
        }
    }

    /**
     * A recursive method to solve knight tour problem
     */
    private boolean explore(int x, int y, int move, int n, int[][] solution, int[] xMove, int[] yMove) {
        int k, nextX, nextY;
        if (move == n * n) {
            return true;
        }

        for (k = 0; k < 8; k++) {
            nextX = x + xMove[k];
            nextY = y + yMove[k];
            if (isValid(nextX, nextY, n, solution)) {
                solution[nextX][nextY] = move;
                if (explore(nextX, nextY, move + 1, n, solution, xMove, yMove)) {
                    return true;
                } else {
                    // Backtracking
                    solution[nextX][nextY] = -1;
                }
            }
        }

        return false;
    }

    /**
     * x and y are valid indexes for next move in chessboard
     */
    private boolean isValid(int x, int y, int n, int[][] solution) {
        return (x >= 0 && x < n && y >= 0 && y < n && solution[x][y] == -1);
    }

}
