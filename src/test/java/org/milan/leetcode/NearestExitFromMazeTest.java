package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link NearestExitFromMaze}
 *
 * @author Milan Rathod
 */
class NearestExitFromMazeTest {

    @Test
    void nearestExit() {
        NearestExitFromMaze nearestExitFromMaze = new NearestExitFromMaze();

        char[][] maze = new char[][]{{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}};

        assertEquals(1, nearestExitFromMaze.nearestExit(maze, new int[]{1, 2}));

        maze = new char[][]{{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}};

        assertEquals(2, nearestExitFromMaze.nearestExit(maze, new int[]{1, 0}));

        maze = new char[][]{{'.', '+'}};

        assertEquals(-1, nearestExitFromMaze.nearestExit(maze, new int[]{0, 0}));
    }
}