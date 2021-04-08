package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link VisitedNodes}
 *
 * @author Milan Rathod
 */
class VisitedNodesTest {

    @Test
    void testFind() {
        VisitedNodes visitedNodes = new VisitedNodes();

        int N = 6;
        int M = 8;
        int[] priorities = new int[]{0, 2, 2, 4, 5, 2, 6};
        int[][] edges = {{0, 1, 7}, {0, 2, 5}, {2, 6, 6},
                {2, 3, 5}, {3, 4, 6}, {6, 3, 3}, {1, 6, 2}, {1, 5, 6}};

        int[] result = visitedNodes.find(N, M, priorities, edges);

        assertArrayEquals(new int[]{31, 5, 14, 20, 37, 11}, result);
    }
}