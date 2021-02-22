package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link EqualMedian}
 *
 * @author Milan Rathod
 */
class EqualMedianTest {

    @Test
    void testFindMinimumSwapOperations() {
        EqualMedian equalMedian = new EqualMedian();

        int result = equalMedian.findMinimumSwapOperations(new int[]{1, 2, 3, 3, 5, 6, 7},
                new int[]{4, 6, 8, 8, 9, 9, 9}, 7);

        assertEquals(2, result);
    }
}