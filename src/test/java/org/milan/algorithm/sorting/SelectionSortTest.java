package org.milan.algorithm.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test Class for {@link SelectionSort}
 *
 * @author Milan Rathod
 */
class SelectionSortTest {

    private SelectionSort selectionSort;

    @BeforeEach
    void setup() {
        selectionSort = new SelectionSort();
    }

    @Test
    void testSort() {
        int[] inputArray = new int[]{4, 5, 3, 2, 4, 1};

        int[] result = selectionSort.sort(inputArray);

        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 5}, result);
    }

    @Test
    void testStableSort() {
        int[] inputArray = new int[]{4, 5, 3, 2, 4, 1};

        int[] result = selectionSort.stableSort(inputArray);

        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 5}, result);
    }
}