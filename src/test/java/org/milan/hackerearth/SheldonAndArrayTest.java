package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link SheldonAndArray}
 *
 * @author Milan Rathod
 */
class SheldonAndArrayTest {

    @Test
    void testFindNearestMaxGCD() {
        SheldonAndArray sheldonAndArray = new SheldonAndArray();

        int[] result = sheldonAndArray.findNearestMaxGCD(new int[]{2, 4, 6, 7, 9});

        assertArrayEquals(new int[]{-1, 1, 2, 3, 3}, result);
    }
}