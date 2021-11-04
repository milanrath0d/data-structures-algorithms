package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ShortestPathInBinaryMaze}
 *
 * @author Milan Rathod
 */
class ShortestPathInBinaryMazeTest {

    @Test
    void testFind() {
        int[][] maze = {{1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
            {1, 0, 1, 1, 1, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 1, 0, 0, 0, 0, 1, 0, 0, 1}};

        Point source = new Point(0, 0);
        Point dest = new Point(3, 4);

        ShortestPathInBinaryMaze shortestPathInBinaryMaze = new ShortestPathInBinaryMaze();

        int result = shortestPathInBinaryMaze.find(maze, source, dest);

        assertEquals(11, result);
    }
}