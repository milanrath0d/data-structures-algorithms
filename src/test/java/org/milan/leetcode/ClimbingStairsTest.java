package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ClimbingStairs}
 *
 * @author Milan Rathod
 */
class ClimbingStairsTest {

    @Test
    void minCost() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        assertEquals(6, climbingStairs.minCost(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}