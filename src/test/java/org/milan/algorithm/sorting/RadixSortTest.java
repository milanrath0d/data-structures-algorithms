package org.milan.algorithm.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link RadixSort}
 *
 * @author Milan Rathod
 */
class RadixSortTest {

    @Test
    void testSort() {
        int[] inputArray = new int[]{64, 8, 216, 512, 27, 729, 2, 343, 125};

        int[] result = new RadixSort().sort(inputArray);

        assertArrayEquals(new int[]{2, 8, 27, 64, 125, 216, 343, 512, 729}, result);
    }
}