package org.milan.geeksforgeeks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link Sudoku}
 *
 * @author Milan Rathod
 */
class SudokuTest {

    private int[][] validSudoku;

    private int[][] invalidSudoku;

    private Sudoku sudoku;

    @BeforeEach
    void setUp() {
        validSudoku = new int[][]{
            {7, 2, 6, 4, 9, 3, 8, 1, 5},
            {3, 1, 5, 7, 2, 8, 9, 4, 6},
            {4, 8, 9, 6, 5, 1, 2, 3, 7},
            {8, 5, 2, 1, 4, 7, 6, 9, 3},
            {6, 7, 3, 9, 8, 5, 1, 2, 4},
            {9, 4, 1, 3, 6, 2, 7, 5, 8},
            {1, 9, 4, 8, 3, 6, 5, 7, 2},
            {5, 6, 7, 2, 1, 4, 3, 8, 9},
            {2, 3, 8, 5, 7, 9, 4, 6, 1}
        };

        invalidSudoku = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}};

        sudoku = new Sudoku();
    }

    @Test
    void testIsValidSudoku() {
        assertTrue(sudoku.isValidSudoku(validSudoku));
        assertFalse(sudoku.isValidSudoku(invalidSudoku));
    }

    @Test
    void testIsValidSudokuV2() {
        assertTrue(sudoku.IsValidSudokuV2(validSudoku));
        assertFalse(sudoku.IsValidSudokuV2(invalidSudoku));
    }
}