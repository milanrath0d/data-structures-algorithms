package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TrailingZerosInFactorial}
 *
 * @author Milan Rathod
 */
class TrailingZerosInFactorialTest {

    @Test
    void testFind() {
        TrailingZerosInFactorial trailingZerosInFactorial = new TrailingZerosInFactorial();

        int result = trailingZerosInFactorial.find(100);

        assertEquals(24, result);
    }
}