package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Knapsack}
 *
 * @author Milan Rathod
 */
class KnapsackTest {

    @Test
    void testFindMaximum() {
        int[] profits = new int[]{60, 100, 120};
        int[] weights = new int[]{10, 20, 30};
        int capacity = 50;

        Knapsack knapsack = new Knapsack();

        int result = knapsack.findMaximum(capacity, weights, profits);

        assertEquals(220, result);
    }
}