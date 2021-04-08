package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link CountStrings}
 *
 * @author Milan Rathod
 */
class CountStringsTest {

    @Test
    void testCount() {
        CountStrings countStrings = new CountStrings();

        int result = countStrings.count(3, 1, 2);

        assertEquals(19, result);
    }

    @Test
    void testCountDP() {
        CountStrings countStrings = new CountStrings();

        int result = countStrings.countDP(3, 1, 2);

        assertEquals(19, result);
    }
}