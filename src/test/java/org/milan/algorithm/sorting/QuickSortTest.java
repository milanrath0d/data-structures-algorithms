package org.milan.algorithm.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link QuickSort}
 *
 * @author Milan Rathod
 */
class QuickSortTest {

    private QuickSort quickSort;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        quickSort = new QuickSort();

        inputArray = new int[]{38, 27, 43, 3, 9, 82, 10};
    }

    @Test
    void testSort() {
        quickSort.sort(inputArray);

        assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, inputArray);
    }

    @Test
    void testIterativeSort() {
        quickSort.sortIterative(inputArray);

        assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, inputArray);
    }
}