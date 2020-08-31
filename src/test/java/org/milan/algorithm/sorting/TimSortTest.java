package org.milan.algorithm.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test Class for {@link TimSort}
 *
 * @author Milan Rathod
 */
class TimSortTest {

    @Test
    void testSort() {
        int[] inputArray = new int[]{4, 5, 3, 2, 4, 1};

        TimSort timSort = new TimSort();

        timSort.sort(inputArray);

        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 5}, inputArray);
    }
}