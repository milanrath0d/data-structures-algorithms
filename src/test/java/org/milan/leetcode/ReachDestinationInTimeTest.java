package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ReachDestinationInTime}
 *
 * @author Milan Rathod
 */
class ReachDestinationInTimeTest {

    @Test
    void minCost() {
        ReachDestinationInTime reachDestinationInTime = new ReachDestinationInTime();

        int[][] edges = new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 5, 10}, {0, 3, 1}, {3, 4, 10}, {4, 5, 15}};

        int[] passingFees = new int[]{5, 1, 2, 20, 20, 3};

        assertEquals(11, reachDestinationInTime.minCost(30, edges, passingFees));

        assertEquals(48, reachDestinationInTime.minCost(29, edges, passingFees));

        assertEquals(-1, reachDestinationInTime.minCost(25, edges, passingFees));
    }
}