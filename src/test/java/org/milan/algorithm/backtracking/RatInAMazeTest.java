package org.milan.algorithm.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link RatInAMaze}
 *
 * @author Milan Rathod
 */
class RatInAMazeTest {

    private RatInAMaze ratInAMaze;

    @BeforeEach
    void setup() {
        ratInAMaze = new RatInAMaze();
    }

    @Test
    void testSolveMaze_SimpleCase() {
        // 1 means open path, 0 means blocked
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        List<String> paths = ratInAMaze.solveMaze(maze);
        
        // Should find at least one path
        assertTrue(paths.size() >= 1);
        
        // One valid path is Down, Right, Down, Down, Right, Right
        boolean validPathFound = false;
        for (String path : paths) {
            if (path.equals("DRDDRR")) {
                validPathFound = true;
                break;
            }
        }
        
        assertTrue(validPathFound, "Expected path DRDDRR not found among solutions");
        
        // Verify all paths are valid
        for (String path : paths) {
            assertTrue(isValidPath(maze, path), "Invalid path found: " + path);
        }
    }
    
    @Test
    void testSolveMaze_MultiplePaths() {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 1}
        };

        List<String> paths = ratInAMaze.solveMaze(maze);
        
        // Should find multiple paths
        assertTrue(paths.size() > 1);
        
        // All paths should end at the target
        for (String path : paths) {
            assertTrue(isValidPath(maze, path));
        }
    }
    
    @Test
    void testSolveMaze_NoSolution() {
        int[][] maze = {
            {1, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 1, 0, 0},
            {0, 1, 1, 1}
        };

        List<String> paths = ratInAMaze.solveMaze(maze);
        
        // Should find no paths since start and end are disconnected
        assertTrue(paths.isEmpty());
    }
    
    @Test
    void testSolveMaze_StartOrEndBlocked() {
        // Start position is blocked
        int[][] maze1 = {
            {0, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        
        List<String> paths1 = ratInAMaze.solveMaze(maze1);
        assertTrue(paths1.isEmpty());
        
        // End position is blocked
        int[][] maze2 = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 0}
        };
        
        List<String> paths2 = ratInAMaze.solveMaze(maze2);
        assertTrue(paths2.isEmpty());
    }
    
    @Test
    void testSolveMaze_EmptyMaze() {
        int[][] emptyMaze = new int[0][0];
        List<String> paths = ratInAMaze.solveMaze(emptyMaze);
        
        // Should handle empty maze gracefully
        assertTrue(paths.isEmpty());
    }
    
    @Test
    void testSolveMaze_NullMaze() {
        List<String> paths = ratInAMaze.solveMaze(null);
        
        // Should handle null input gracefully
        assertTrue(paths.isEmpty());
    }
    
    @Test
    void testSolveMaze_SingleCell() {
        int[][] maze = {{1}};
        
        List<String> paths = ratInAMaze.solveMaze(maze);
        
        // For a single cell maze, the empty path is valid
        assertEquals(1, paths.size());
        assertEquals("", paths.get(0));
    }
    
    /**
     * Helper method to validate if a path is valid for the given maze
     */
    private boolean isValidPath(int[][] maze, String path) {
        int x = 0, y = 0;
        int n = maze.length;
        
        for (char move : path.toCharArray()) {
            switch (move) {
                case 'D':
                    x++;
                    break;
                case 'U':
                    x--;
                    break;
                case 'R':
                    y++;
                    break;
                case 'L':
                    y--;
                    break;
            }
            
            // Check if the move is valid
            if (x < 0 || x >= n || y < 0 || y >= n || maze[x][y] == 0) {
                return false;
            }
        }
        
        // Check if we reached the destination
        return x == n - 1 && y == n - 1;
    }
}