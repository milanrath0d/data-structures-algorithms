package org.milan.algorithm.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test Class for {@link MergeSort}
 *
 * @author Milan Rathod
 */
class MergeSortTest {

    private MergeSort mergeSort;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        mergeSort = new MergeSort();

        inputArray = new int[]{38, 27, 43, 3, 9, 82, 10};
    }

    @Test
    void testSort() {
        mergeSort.sort(inputArray);

        assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, inputArray);
    }

    @Test
    void testIterativeSort() {
        mergeSort.sortIterative(inputArray);

        assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, inputArray);
    }
}