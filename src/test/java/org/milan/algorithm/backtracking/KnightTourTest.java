package org.milan.algorithm.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link KnightTour}
 *
 * @author Milan Rathod
 */
class KnightTourTest {

    private KnightTour knightTour;

    @BeforeEach
    void setup() {
        knightTour = new KnightTour();
    }

    @Test
    void testSolveKnightTour_N1() {
        // For a 1x1 board, the knight is already at the only square
        int[][] result = knightTour.solve(1);
        
        // Expected result is a 1x1 matrix with value 0
        assertEquals(1, result.length);
        assertEquals(1, result[0].length);
        assertEquals(0, result[0][0]);
    }

    @Test
    void testSolveKnightTour_N2() {
        // For a 2x2 board, no solution exists
        int[][] result = knightTour.solve(2);
        
        // Expected result is {{-1}} indicating no solution
        assertEquals(1, result.length);
        assertEquals(1, result[0].length);
        assertEquals(-1, result[0][0]);
    }

    @Test
    void testSolveKnightTour_N3() {
        // For a 3x3 board, no solution exists
        int[][] result = knightTour.solve(3);
        
        // Expected result is {{-1}} indicating no solution
        assertEquals(1, result.length);
        assertEquals(1, result[0].length);
        assertEquals(-1, result[0][0]);
    }

    @Test
    void testSolveKnightTour_N5() {
        // For a 5x5 board, a solution exists
        int[][] result = knightTour.solve(5);
        
        // Board size check
        assertEquals(5, result.length);
        assertEquals(5, result[0].length);
        
        // Initial position check - knight starts at position (0,0)
        assertEquals(0, result[0][0]);
        
        // Check if all cells are visited exactly once
        boolean[] visited = new boolean[5 * 5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int moveNumber = result[i][j];
                assertTrue(moveNumber >= 0 && moveNumber < 5 * 5, 
                          "Move number out of range: " + moveNumber);
                assertFalse(visited[moveNumber], 
                           "Move " + moveNumber + " appears more than once");
                visited[moveNumber] = true;
            }
        }
        
        // Check if all cells are visited
        for (int i = 0; i < 5 * 5; i++) {
            assertTrue(visited[i], "Move " + i + " is missing");
        }
        
        // Validate that each move is a valid knight's move
        validateKnightMoves(result, 5);
    }

    @Test
    void testSolveKnightTour_N8() {
        // For an 8x8 board (standard chess board), a solution exists
        int[][] result = knightTour.solve(8);
        
        // Board size check
        assertEquals(8, result.length);
        assertEquals(8, result[0].length);
        
        // Initial position check - knight starts at position (0,0)
        assertEquals(0, result[0][0]);
        
        // Check if all cells are visited exactly once
        boolean[] visited = new boolean[8 * 8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int moveNumber = result[i][j];
                assertTrue(moveNumber >= 0 && moveNumber < 8 * 8, 
                          "Move number out of range: " + moveNumber);
                assertFalse(visited[moveNumber], 
                           "Move " + moveNumber + " appears more than once");
                visited[moveNumber] = true;
            }
        }
        
        // Check if all cells are visited
        for (int i = 0; i < 8 * 8; i++) {
            assertTrue(visited[i], "Move " + i + " is missing");
        }
        
        // Validate that each move is a valid knight's move
        validateKnightMoves(result, 8);
    }
    
    /**
     * Helper method to validate that each consecutive move in the solution
     * is a valid knight's move
     *
     * @param solution the knight's tour solution matrix
     * @param n size of the board
     */
    private void validateKnightMoves(int[][] solution, int n) {
        // All valid knight moves
        int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        
        // For each move number from 0 to n²-2, check if the next move is valid
        for (int move = 0; move < n * n - 1; move++) {
            int x1 = -1, y1 = -1, x2 = -1, y2 = -1;
            
            // Find coordinates of current move
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (solution[i][j] == move) {
                        x1 = i;
                        y1 = j;
                    } else if (solution[i][j] == move + 1) {
                        x2 = i;
                        y2 = j;
                    }
                }
            }
            
            // Check if the move from (x1,y1) to (x2,y2) is a valid knight's move
            boolean validMove = false;
            for (int k = 0; k < 8; k++) {
                if (x1 + dx[k] == x2 && y1 + dy[k] == y2) {
                    validMove = true;
                    break;
                }
            }
            
            assertTrue(validMove, "Invalid knight move from position " + move + 
                      " (" + x1 + "," + y1 + ") to position " + (move + 1) + 
                      " (" + x2 + "," + y2 + ")");
        }
    }
}
