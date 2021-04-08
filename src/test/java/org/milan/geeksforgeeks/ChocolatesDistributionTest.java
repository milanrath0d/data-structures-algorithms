package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ChocolatesDistribution}
 *
 * @author Milan Rathod
 */
class ChocolatesDistributionTest {

    @Test
    void testMaxNumOfChocolates() {
        ChocolatesDistribution chocolatesDistribution = new ChocolatesDistribution();

        int[] inputArray = {1, 2, 3, 4, 5};
        int result = chocolatesDistribution.maxNumOfChocolates(inputArray, inputArray.length, 4);

        assertEquals(3, result);
    }
}