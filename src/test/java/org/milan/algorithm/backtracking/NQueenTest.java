package org.milan.algorithm.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link NQueen}
 *
 * @author Milan Rathod
 */
class NQueenTest {

    private NQueen nQueen;

    @BeforeEach
    void setup() {
        nQueen = new NQueen();
    }

    @Test
    void testSolveUsingNaiveApproach_N1() {
        List<List<String>> result = nQueen.solveUsingNaiveApproach(1);
        
        // For 1×1 board, there should be only 1 solution: Q
        assertEquals(1, result.size());
        assertEquals("Q", result.get(0).get(0));
    }
    
    @Test
    void testSolveUsingBackTracking_N1() {
        List<List<String>> result = nQueen.solveUsingBackTracking(1);
        
        // For 1×1 board, there should be only 1 solution: Q
        assertEquals(1, result.size());
        assertEquals("Q", result.get(0).get(0));
    }
    
    @Test
    void testSolveUsingBackTrackingV2_N1() {
        List<List<String>> result = nQueen.solveUsingBackTrackingV2(1);
        
        // For 1×1 board, there should be only 1 solution: Q
        assertEquals(1, result.size());
        assertEquals("Q", result.get(0).get(0));
    }
    
    @Test
    void testSolveUsingNaiveApproach_N4() {
        List<List<String>> result = nQueen.solveUsingNaiveApproach(4);
        
        // For 4×4 board, there should be exactly 2 solutions
        assertEquals(2, result.size());
        
        // Convert to set to check unique solutions
        Set<List<String>> uniqueSolutions = new HashSet<>(result);
        assertEquals(2, uniqueSolutions.size());
        
        // Verify the expected solutions
        boolean foundSolution1 = false;
        boolean foundSolution2 = false;
        
        for (List<String> solution : result) {
            if (solution.get(0).equals(".Q..") &&
                solution.get(1).equals("...Q") &&
                solution.get(2).equals("Q...") &&
                solution.get(3).equals("..Q.")) {
                foundSolution1 = true;
            }
            
            if (solution.get(0).equals("..Q.") &&
                solution.get(1).equals("Q...") &&
                solution.get(2).equals("...Q") &&
                solution.get(3).equals(".Q..")) {
                foundSolution2 = true;
            }
        }
        
        assertTrue(foundSolution1, "First expected solution not found");
        assertTrue(foundSolution2, "Second expected solution not found");
    }
    
    @Test
    void testSolveUsingBackTracking_N4() {
        List<List<String>> result = nQueen.solveUsingBackTracking(4);
        
        // For 4×4 board, there should be exactly 2 solutions
        assertEquals(2, result.size());
        
        // Convert to set to check unique solutions
        Set<List<String>> uniqueSolutions = new HashSet<>(result);
        assertEquals(2, uniqueSolutions.size());
        
        // Verify the expected solutions
        boolean foundSolution1 = false;
        boolean foundSolution2 = false;
        
        for (List<String> solution : result) {
            if (solution.get(0).equals(".Q..") &&
                solution.get(1).equals("...Q") &&
                solution.get(2).equals("Q...") &&
                solution.get(3).equals("..Q.")) {
                foundSolution1 = true;
            }
            
            if (solution.get(0).equals("..Q.") &&
                solution.get(1).equals("Q...") &&
                solution.get(2).equals("...Q") &&
                solution.get(3).equals(".Q..")) {
                foundSolution2 = true;
            }
        }
        
        assertTrue(foundSolution1, "First expected solution not found");
        assertTrue(foundSolution2, "Second expected solution not found");
    }
    
    @Test
    void testSolveUsingBackTrackingV2_N4() {
        List<List<String>> result = nQueen.solveUsingBackTrackingV2(4);
        
        // For 4×4 board, there should be exactly 2 solutions
        assertEquals(2, result.size());
        
        // Convert to set to check unique solutions
        Set<List<String>> uniqueSolutions = new HashSet<>(result);
        assertEquals(2, uniqueSolutions.size());
        
        // Verify the expected solutions
        boolean foundSolution1 = false;
        boolean foundSolution2 = false;
        
        for (List<String> solution : result) {
            if (solution.get(0).equals(".Q..") &&
                solution.get(1).equals("...Q") &&
                solution.get(2).equals("Q...") &&
                solution.get(3).equals("..Q.")) {
                foundSolution1 = true;
            }
            
            if (solution.get(0).equals("..Q.") &&
                solution.get(1).equals("Q...") &&
                solution.get(2).equals("...Q") &&
                solution.get(3).equals(".Q..")) {
                foundSolution2 = true;
            }
        }
        
        assertTrue(foundSolution1, "First expected solution not found");
        assertTrue(foundSolution2, "Second expected solution not found");
    }
    
    @Test
    void testSolveUsingNaiveApproach_N0() {
        List<List<String>> result = nQueen.solveUsingNaiveApproach(0);
        
        // For 0×0 board, there should be no solutions
        assertTrue(result.isEmpty());
    }
    
    @Test
    void testSolveUsingBackTracking_N0() {
        List<List<String>> result = nQueen.solveUsingBackTracking(0);
        
        // For 0×0 board, there should be no solutions
        assertTrue(result.isEmpty());
    }
    
    @Test
    void testSolveUsingBackTrackingV2_N0() {
        List<List<String>> result = nQueen.solveUsingBackTrackingV2(0);
        
        // For 0×0 board, there should be no solutions
        assertTrue(result.isEmpty());
    }
    
    @Test
    void testSolveUsingNaiveApproach_N8() {
        List<List<String>> result = nQueen.solveUsingNaiveApproach(8);
        
        // For 8×8 board, there should be exactly 92 solutions
        assertEquals(92, result.size());
        
        // Verify all solutions are valid
        for (List<String> solution : result) {
            // Check board dimensions
            assertEquals(8, solution.size());
            for (String row : solution) {
                assertEquals(8, row.length());
            }
            
            // Verify each solution has exactly 8 queens
            int queenCount = 0;
            for (String row : solution) {
                for (char c : row.toCharArray()) {
                    if (c == 'Q') {
                        queenCount++;
                    }
                }
            }
            assertEquals(8, queenCount);
            
            // Verify no queens attack each other
            assertTrue(isValidSolution(solution));
        }
    }
    
    @Test
    void testSolveUsingBackTracking_N8() {
        List<List<String>> result = nQueen.solveUsingBackTracking(8);
        
        // For 8×8 board, there should be exactly 92 solutions
        assertEquals(92, result.size());
        
        // Verify all solutions are valid
        for (List<String> solution : result) {
            // Check board dimensions
            assertEquals(8, solution.size());
            for (String row : solution) {
                assertEquals(8, row.length());
            }
            
            // Verify each solution has exactly 8 queens
            int queenCount = 0;
            for (String row : solution) {
                for (char c : row.toCharArray()) {
                    if (c == 'Q') {
                        queenCount++;
                    }
                }
            }
            assertEquals(8, queenCount);
            
            // Verify no queens attack each other
            assertTrue(isValidSolution(solution));
        }
    }
    
    @Test
    void testSolveUsingBackTrackingV2_N8() {
        List<List<String>> result = nQueen.solveUsingBackTrackingV2(8);
        
        // For 8×8 board, there should be exactly 92 solutions
        assertEquals(92, result.size());
        
        // Verify all solutions are valid
        for (List<String> solution : result) {
            // Check board dimensions
            assertEquals(8, solution.size());
            for (String row : solution) {
                assertEquals(8, row.length());
            }
            
            // Verify each solution has exactly 8 queens
            int queenCount = 0;
            for (String row : solution) {
                for (char c : row.toCharArray()) {
                    if (c == 'Q') {
                        queenCount++;
                    }
                }
            }
            assertEquals(8, queenCount);
            
            // Verify no queens attack each other
            assertTrue(isValidSolution(solution));
        }
    }
    
    @Test
    void testBothApproachesProduceSameSolutions() {
        // Test for N=4 (small enough to be quick but has multiple solutions)
        List<List<String>> naiveResult = nQueen.solveUsingNaiveApproach(4);
        List<List<String>> backtrackingResult = nQueen.solveUsingBackTracking(4);
        
        // Both approaches should produce the same number of solutions
        assertEquals(naiveResult.size(), backtrackingResult.size());
        
        // Convert to sets to compare solution content regardless of order
        Set<List<String>> naiveSolutions = new HashSet<>(naiveResult);
        Set<List<String>> backtrackingSolutions = new HashSet<>(backtrackingResult);
        
        // The sets of solutions should be identical
        assertEquals(naiveSolutions.size(), backtrackingSolutions.size());
        assertTrue(naiveSolutions.containsAll(backtrackingSolutions));
    }
    
    @Test
    void testAllApproachesProduceSameSolutions() {
        // Test for N=4 (small enough to be quick but has multiple solutions)
        List<List<String>> naiveResult = nQueen.solveUsingNaiveApproach(4);
        List<List<String>> backtrackingResult = nQueen.solveUsingBackTracking(4);
        List<List<String>> backtrackingV2Result = nQueen.solveUsingBackTrackingV2(4);
        
        // All approaches should produce the same number of solutions
        assertEquals(naiveResult.size(), backtrackingResult.size());
        assertEquals(naiveResult.size(), backtrackingV2Result.size());
        
        // Convert to sets to compare solution content regardless of order
        Set<List<String>> naiveSolutions = new HashSet<>(naiveResult);
        Set<List<String>> backtrackingSolutions = new HashSet<>(backtrackingResult);
        Set<List<String>> backtrackingV2Solutions = new HashSet<>(backtrackingV2Result);
        
        // The sets of solutions should be identical
        assertEquals(naiveSolutions.size(), backtrackingSolutions.size());
        assertEquals(naiveSolutions.size(), backtrackingV2Solutions.size());
        assertTrue(naiveSolutions.containsAll(backtrackingSolutions));
        assertTrue(naiveSolutions.containsAll(backtrackingV2Solutions));
    }
    
    /**
     * Checks if a solution is valid (no queens attack each other)
     */
    private boolean isValidSolution(List<String> board) {
        int n = board.size();
        
        // Check rows and columns
        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            int colCount = 0;
            
            for (int j = 0; j < n; j++) {
                if (board.get(i).charAt(j) == 'Q') {
                    rowCount++;
                }
                if (board.get(j).charAt(i) == 'Q') {
                    colCount++;
                }
            }
            
            // Each row and column should have exactly one queen
            if (rowCount != 1 || colCount != 1) {
                return false;
            }
        }
        
        // Check diagonals
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board.get(i).charAt(j) == 'Q') {
                    // Check if any other queen exists in the diagonals
                    if (!checkDiagonals(board, i, j)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
    
    /**
     * Checks if no other queen exists in the diagonals from position (row, col)
     */
    private boolean checkDiagonals(List<String> board, int row, int col) {
        int n = board.size();
        
        // Check diagonal: top-left to bottom-right
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != row && j != col && Math.abs(i - row) == Math.abs(j - col)) {
                    if (board.get(i).charAt(j) == 'Q') {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
} 