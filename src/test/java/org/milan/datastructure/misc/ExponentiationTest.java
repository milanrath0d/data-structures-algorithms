package org.milan.datastructure.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link Exponentiation}
 *
 * @author Milan Rathod
 */
class ExponentiationTest {

    @Test
    void testPow() {
        Exponentiation exponentiation = new Exponentiation();

        assertEquals(32, exponentiation.pow(2, 5));
    }
}