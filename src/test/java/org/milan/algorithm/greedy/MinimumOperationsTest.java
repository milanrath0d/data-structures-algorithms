package org.milan.algorithm.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinimumOperations}
 *
 * @author Milan Rathod
 */
class MinimumOperationsTest {

    @Test
    void testMinimumCost() {
        MinimumOperations minimumOperations = new MinimumOperations();

        int result = minimumOperations.minimumCost(9, 5, 1);

        assertEquals(13, result);
    }
}