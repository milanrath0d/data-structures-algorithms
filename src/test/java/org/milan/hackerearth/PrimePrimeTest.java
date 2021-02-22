package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class {@link PrimePrime}
 *
 * @author Milan Rathod
 */
class PrimePrimeTest {

    @Test
    void testPrimeCount() {
        PrimePrime primePrime = new PrimePrime();

        long result = primePrime.calculatePrimeCount(1, 839);

        assertEquals(190, result);

        result = primePrime.getPrimeCount(3, 10);

        assertEquals(4, result);
    }
}