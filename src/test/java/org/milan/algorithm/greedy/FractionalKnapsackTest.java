package org.milan.algorithm.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link FractionalKnapsack}
 *
 * @author Milan Rathod
 */
class FractionalKnapsackTest {

    @Test
    void testGetMaxProfit() {
        FractionalKnapsack fractionalKnapsack = new FractionalKnapsack();

        int[] weights = {10, 40, 20, 30};
        int[] profits = {60, 40, 100, 120};
        int capacity = 50;

        double result = fractionalKnapsack.getMaxProfit(weights, profits, capacity);

        assertEquals(240, result, 0.001);
    }
}