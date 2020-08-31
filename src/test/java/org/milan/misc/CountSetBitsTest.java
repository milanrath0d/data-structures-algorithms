package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link CountSetBits}
 *
 * @author Milan Rathod
 */
class CountSetBitsTest {

    @Test
    void testCount() {
        CountSetBits countSetBits = new CountSetBits();
        int result = countSetBits.count(31);

        assertEquals(5, result);
    }

    @Test
    void testCountRec() {
        CountSetBits countSetBits = new CountSetBits();
        int result = countSetBits.countRec(31);

        assertEquals(5, result);
    }
}