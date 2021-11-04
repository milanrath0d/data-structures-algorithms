package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinCostPath}
 *
 * @author Milan Rathod
 */
class MinCostPathTest {

    @Test
    void testMinCost() {
        int cost[][] = {{1, 2, 3},
            {4, 8, 2},
            {1, 5, 3}};

        MinCostPath minCostPath = new MinCostPath();

        int result = minCostPath.minCost(cost, 2, 2);

        assertEquals(8, result);
    }

    @Test
    void testMinCostV2() {
        int cost[][] = {{1, 2, 3},
            {4, 8, 2},
            {1, 5, 3}};

        MinCostPath minCostPath = new MinCostPath();

        int result = minCostPath.minCostV2(cost, 2, 2);

        assertEquals(8, result);
    }

    @Test
    void testMinCostV3() {
        int cost[][] = {{1, 2, 3},
            {4, 8, 2},
            {1, 5, 3}};

        MinCostPath minCostPath = new MinCostPath();

        int result = minCostPath.minCostV3(cost, 2, 2);

        assertEquals(8, result);
    }
}