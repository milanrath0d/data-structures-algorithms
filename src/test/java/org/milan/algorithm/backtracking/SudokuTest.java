package org.milan.algorithm.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link Sudoku}
 * 
 * Based on LeetCode Sudoku Solver problem where it is guaranteed that
 * each input board has one and only one solution.
 *
 * @author Milan Rathod
 */
class SudokuTest {

    private Sudoku sudoku;

    @BeforeEach
    void setup() {
        sudoku = new Sudoku();
    }

    @Test
    void testSolve_Example1() {
        // The example from LeetCode Sudoku Solver problem
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        
        sudoku.solve(board);
        
        // Expected solution
        char[][] expected = {
            {'5','3','4','6','7','8','9','1','2'},
            {'6','7','2','1','9','5','3','4','8'},
            {'1','9','8','3','4','2','5','6','7'},
            {'8','5','9','7','6','1','4','2','3'},
            {'4','2','6','8','5','3','7','9','1'},
            {'7','1','3','9','2','4','8','5','6'},
            {'9','6','1','5','3','7','2','8','4'},
            {'2','8','7','4','1','9','6','3','5'},
            {'3','4','5','2','8','6','1','7','9'}
        };
        
        // Check that the solution matches expected solution
        assertArrayEquals(expected, board);
    }

    @Test
    void testSolve_ValidSudoku() {
        // Test with a different initial configuration that has exactly one solution
        char[][] board = {
            {'.','.','9','7','4','8','.','.','.'},
            {'7','.','.','.','.','.','.','.','.'},
            {'.','2','.','1','.','9','.','.','.'},
            {'.','.','7','.','.','.','2','4','.'},
            {'.','6','4','.','1','.','5','9','.'},
            {'.','9','8','.','.','.','3','.','.'},
            {'.','.','.','8','.','3','.','2','.'},
            {'.','.','.','.','.','.','.','.','6'},
            {'.','.','.','2','7','5','9','.','.'}
        };
        
        sudoku.solve(board);
        
        // Validate the solution
        validateSudoku(board);
    }

    @Test
    void testSolve_MinimallySolvableSudoku() {
        // Test with a minimally filled Sudoku board that has exactly one solution
        // Typically, a valid Sudoku puzzle needs at least 17 clues to have a unique solution
        char[][] board = {
            {'.','.','.','2','.','.','.','6','3'},
            {'3','.','.','.','.','5','4','.','1'},
            {'.','.','1','.','.','3','9','8','.'},
            {'.','.','.','.','.','.','.','9','.'},
            {'.','.','.','5','3','8','.','.','.'},
            {'.','3','.','.','.','.','.','.','.'},
            {'.','2','6','3','.','.','5','.','.'},
            {'5','.','3','7','.','.','.','.','8'},
            {'4','7','.','.','.','1','.','.','.'}
        };
        
        sudoku.solve(board);
        
        // Validate the solution
        validateSudoku(board);
    }

    @Test
    void testSolve_HardSudoku() {
        // Test with a harder Sudoku puzzle that still has exactly one solution
        char[][] board = {
            {'.','.','.','.','.','7','.','.','.'},
            {'1','.','.','.','.','.','.','.','5'},
            {'.','.','2','.','.','.','.','.','.'},
            {'.','9','.','.','6','.','.','.','8'},
            {'.','.','.','.','.','.','.','.','.'},
            {'3','.','.','.','.','5','.','.','7'},
            {'.','.','.','.','.','.','4','.','.'},
            {'.','.','.','2','.','.','.','.','.'},
            {'.','.','.','.','5','.','.','.','9'}
        };
        
        sudoku.solve(board);
        
        // Validate the solution
        validateSudoku(board);
    }

    /**
     * Helper method to validate that a solved Sudoku board follows all Sudoku rules:
     * 1. Each row contains digits 1-9 without repetition
     * 2. Each column contains digits 1-9 without repetition
     * 3. Each 3x3 box contains digits 1-9 without repetition
     */
    private void validateSudoku(char[][] board) {
        // Check that all cells are filled
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                assertNotEquals('.', board[i][j], 
                    "Cell at position (" + i + "," + j + ") is not filled");
            }
        }
        
        // Check rows
        for (int row = 0; row < 9; row++) {
            boolean[] seen = new boolean[9];
            for (int col = 0; col < 9; col++) {
                int digit = board[row][col] - '1';
                assertFalse(seen[digit], 
                    "Duplicate digit " + (digit + 1) + " found in row " + row);
                seen[digit] = true;
            }
        }
        
        // Check columns
        for (int col = 0; col < 9; col++) {
            boolean[] seen = new boolean[9];
            for (int row = 0; row < 9; row++) {
                int digit = board[row][col] - '1';
                assertFalse(seen[digit], 
                    "Duplicate digit " + (digit + 1) + " found in column " + col);
                seen[digit] = true;
            }
        }
        
        // Check 3x3 sub-boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                boolean[] seen = new boolean[9];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = boxRow * 3 + i;
                        int col = boxCol * 3 + j;
                        int digit = board[row][col] - '1';
                        assertFalse(seen[digit], 
                            "Duplicate digit " + (digit + 1) + " found in 3x3 box at (" + boxRow + "," + boxCol + ")");
                        seen[digit] = true;
                    }
                }
            }
        }
    }
}
