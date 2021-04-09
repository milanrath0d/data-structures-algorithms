package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class {@link KthPrime}
 *
 * @author Milan Rathod
 */
class KthPrimeTest {

    @Test
    void testCalculateMinimumOperations() {
        KthPrime kthPrime = new KthPrime();

        int result = kthPrime.calculateMinimumOperations(new int[]{12, 2, 1, 14}, 3);

        assertEquals(2, result);
    }
}