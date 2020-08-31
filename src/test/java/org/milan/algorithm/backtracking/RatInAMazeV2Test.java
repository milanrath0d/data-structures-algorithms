package org.milan.algorithm.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link RatInAMazeV2}
 *
 * @author Milan Rathod
 */
class RatInAMazeV2Test {

    @Test
    void testSolveMaze() {
        int[][] maze = {{2, 1, 0, 0},
                {3, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 1}};
        RatInAMazeV2 ratInAMazeV2 = new RatInAMazeV2();

        boolean result = ratInAMazeV2.solveMaze(maze);

        assertTrue(result);
    }
}