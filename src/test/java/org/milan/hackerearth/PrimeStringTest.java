package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link PrimeString}
 *
 * @author Milan Rathod
 */
class PrimeStringTest {

    @Test
    void testIsPrimeString() {
        PrimeString primeString = new PrimeString();

        assertTrue(primeString.isPrimeString("ababb"));

        assertFalse(primeString.isPrimeString("abcab"));
    }
}