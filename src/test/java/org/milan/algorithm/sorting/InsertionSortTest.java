package org.milan.algorithm.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test Class for {@link InsertionSort}
 * <p>
 * Time complexity: O(n*n)
 * Space complexity: O(1)
 * In Place algorithm
 * Stable algorithm
 *
 * @author Milan Rathod
 */
class InsertionSortTest {

    private InsertionSort insertionSort;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        insertionSort = new InsertionSort();

        inputArray = new int[]{23, 12, 3, 56, 77, 44, 13, 99};
    }

    @Test
    void testSort() {
        int[] result = insertionSort.sort(inputArray);

        assertArrayEquals(new int[]{3, 12, 13, 23, 44, 56, 77, 99}, result);
    }

    @Test
    void testRecursiveSort() {
        insertionSort.recursiveSort(inputArray, inputArray.length);

        assertArrayEquals(new int[]{3, 12, 13, 23, 44, 56, 77, 99}, inputArray);
    }
}