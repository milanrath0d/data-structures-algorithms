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
        int result = equalMedian.findMinimumSwapOperations(new int[]{1, 2, 3, 7, 8}, new int[]{1, 6, 6, 6, 9}, 5);

        assertEquals(1, result);
    }
}