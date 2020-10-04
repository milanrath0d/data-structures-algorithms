package org.milan.geeksforgeeks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link CountSetBits}
 *
 * @author Milan Rathod
 */
class CountSetBitsTest {

    private CountSetBits countSetBits;

    @BeforeEach
    void init() {
        countSetBits = new CountSetBits();
    }

    @Test
    void testCount() {
        int result = countSetBits.count(31);

        assertEquals(5, result);
    }

    @Test
    void testCountV2() {
        int result = countSetBits.countV2(31);

        assertEquals(5, result);
    }
}