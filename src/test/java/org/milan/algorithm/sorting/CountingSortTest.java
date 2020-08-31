package org.milan.algorithm.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test Class for {@link CountingSort}
 *
 * @author Milan Rathod
 */
class CountingSortTest {

    private CountingSort countingSort;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        countingSort = new CountingSort();

        inputArray = new int[]{170, 45, 75, 90, 80, 24, 2, 66};
    }

    @Test
    void testSort_PositiveNumbers() {
        int[] result = countingSort.sort(inputArray);

        assertArrayEquals(new int[]{2, 24, 45, 66, 75, 80, 90, 170}, result);
    }

    @Test
    void testSort_NegativeNumbers() {
        int[] inputArray = new int[]{-10, 12, 20, -1, -3};

        int[] result = countingSort.sort(inputArray);

        assertArrayEquals(new int[]{-10, -3, -1, 12, 20}, result);
    }

    @Test
    void testSortPositive() {
        int[] result = countingSort.sortPositive(inputArray);

        assertArrayEquals(new int[]{2, 24, 45, 66, 75, 80, 90, 170}, result);
    }
}