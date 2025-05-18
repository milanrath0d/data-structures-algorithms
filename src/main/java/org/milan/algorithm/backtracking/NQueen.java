package org.milan.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: N Queen problem
 * <p>
 * refer {@link @<a href="https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/">...</a>}
 *
 * @author Milan Rathod
 */
public class NQueen {

    /**
     * Solves the N-Queen problem using backtracking.
     * The N-Queen problem is to place N queens on an N×N chessboard such that no two queens
     * attack each other. A queen can attack horizontally, vertically, or diagonally.
     * 
     * Time Complexity: O(N!), where N is the size of the board.
     * In the worst case, we need to explore all possible configurations.
     * 
     * Space Complexity: O(N²) for the board representation, plus O(N) for the recursion stack,
     * resulting in O(N²) overall.
     * 
     * @param n the size of the board (N×N) and the number of queens to place
     * @return a list of all possible solutions, where each solution is represented as a list of strings
     */
    public List<List<String>> solveUsingBackTracking(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }

        int[][] board = new int[n][n];

        explore(0, n, board, result);

        return result;
    }
    
    /**
     * Solves N-Queens problem using optimized backtracking approach with boolean arrays
     * for tracking occupied rows and diagonals
     *
     * @param n board size
     * @return list of all valid queen placements
     */
    public List<List<String>> solveUsingBackTrackingV2(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }
        
        int[][] board = new int[n][n];
        
        // Arrays to track occupied rows and diagonals
        boolean[] rows = new boolean[n];                // Tracks if a row is occupied
        boolean[] majorDiag = new boolean[2 * n - 1];   // Tracks if a major diagonal (row + col) is occupied
        boolean[] minorDiag = new boolean[2 * n - 1];   // Tracks if a minor diagonal (row - col + n - 1) is occupied
        
        exploreV2(0, n, board, result, rows, majorDiag, minorDiag);
        
        return result;
    }

    /**
     * Solves the N-Queen problem using a naive approach.
     * This approach uses a list to store the positions of the queens and checks if the placement is safe.
     * 
     * Time Complexity: O(N!), where N is the size of the board.
     * In the worst case, we need to explore all possible configurations.
     * 
     * Space Complexity: O(N) for the list of queens and the visited array.
     * 
     * @param n the size of the board (N×N) and the number of queens to place
     * @return a list of all possible solutions, where each solution is represented as a list of strings
     */
    public List<List<String>> solveUsingNaiveApproach(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }

        List<Integer> board = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        exploreUsingNaive(1, n, board, result, visited);

        return result;
    }

    private void explore(int column, int n, int[][] board, List<List<String>> result) {
        // Base condition: if all queens are placed
        if (column >= n) {
            // Add the current board configuration to the result
            result.add(constructBoardSolution(board, n));
            return;
        }

        // Consider this column and try placing this queen in all rows one by one
        for (int i = 0; i < n; i++) {

            // Check if it is safe to place queen on board[i][column]
            if (isValid(i, column, n, board)) {
                board[i][column] = 1;

                explore(column + 1, n, board, result);

                // Backtrack - if placing a queen on board[i][column] does not lead to a solution
                board[i][column] = 0;
            }
        }
    }
    
    /**
     * Optimized recursive backtracking method using boolean arrays for tracking
     *
     * @param col        current column to place queen
     * @param n          board size
     * @param board      current board state
     * @param result     list to store solutions
     * @param rows       array tracking occupied rows
     * @param majorDiag  array tracking occupied major diagonals (row + col)
     * @param minorDiag  array tracking occupied minor diagonals (row - col + n - 1)
     */
    private void exploreV2(int col, int n, int[][] board, List<List<String>> result, 
                          boolean[] rows, boolean[] majorDiag, boolean[] minorDiag) {
        // If all queens are placed, add the solution
        if (col >= n) {
            result.add(constructBoardSolution(board, n));
            return;
        }
        
        // Try placing a queen in each row of the current column
        for (int row = 0; row < n; row++) {
            // Calculate diagonal indices
            int majorDiagIdx = row + col;
            int minorDiagIdx = row - col + n - 1;
            
            // Check if we can place a queen at this position
            if (!rows[row] && !majorDiag[majorDiagIdx] && !minorDiag[minorDiagIdx]) {
                // Place queen
                board[row][col] = 1;
                
                // Mark row and diagonals as occupied
                rows[row] = true;
                majorDiag[majorDiagIdx] = true;
                minorDiag[minorDiagIdx] = true;
                
                // Explore next column
                exploreV2(col + 1, n, board, result, rows, majorDiag, minorDiag);
                
                // Backtrack
                board[row][col] = 0;
                rows[row] = false;
                majorDiag[majorDiagIdx] = false;
                minorDiag[minorDiagIdx] = false;
            }
        }
    }

    private List<String> constructBoardSolution(int[][] board, int n) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    row.append("Q");
                } else {
                    row.append(".");
                }
            }
            solution.add(row.toString());
        }
        return solution;
    }

    private boolean isValid(int row, int column, int n, int[][] board) {
        // Check left side of row
        for (int i = 0; i < column; i++) {
            if (board[row][i] == 1)
                return false;
        }

        // Check for upper diagonal on left side
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check for lower diagonal on left side
        for (int i = row, j = column; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    private void exploreUsingNaive(int col, int n,
                                   List<Integer> board,
                                   List<List<String>> result,
                                   boolean[] visited) {

        // If all queens placed, add to result
        if (col > n) {
            result.add(constructSolution(board, n));
            return;
        }

        // Try each row in column
        for (int row = 1; row <= n; row++) {

            // If row not used
            if (!visited[row]) {

                // Check safety
                if (isSafe(board, row, col)) {

                    // Mark row
                    visited[row] = true;

                    // Place queen
                    board.add(row);

                    // Recur for next column
                    exploreUsingNaive(col + 1, n, board,
                        result, visited);

                    // Backtrack
                    board.removeLast();
                    visited[row] = false;
                }
            }
        }
    }

    private List<String> constructSolution(List<Integer> board, int n) {
        List<String> solution = new ArrayList<>();
        
        // Convert the 1-indexed board representation to string format
        for (int row = 1; row <= n; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 1; col <= n; col++) {
                // If this column has a queen in the current row
                if (board.size() >= col && board.get(col - 1) == row) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            solution.add(sb.toString());
        }
        
        return solution;
    }

    private boolean isSafe(List<Integer> board,
                           int currRow, int currCol) {

        for (int i = 0; i < board.size(); i++) {
            int placedRow = board.get(i);
            int placedCol = i + 1;

            // Check diagonals
            if (Math.abs(placedRow - currRow) ==
                Math.abs(placedCol - currCol)) {
                return false; // Not safe
            }
        }
        return true; // Safe to place
    }
}
