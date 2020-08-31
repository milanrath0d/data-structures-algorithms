package org.milan.algorithm.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link RatInAMaze}
 *
 * @author Milan Rathod
 */
class RatInAMazeTest {

    @Test
    void testSolveMaze() {
        int[][] maze = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};
        RatInAMaze ratInAMaze = new RatInAMaze();

        boolean result = ratInAMaze.solveMaze(maze);

        assertTrue(result);
    }
}