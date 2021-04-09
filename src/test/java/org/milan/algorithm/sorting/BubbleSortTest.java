package org.milan.algorithm.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link BubbleSort}
 *
 * @author Milan Rathod
 */
class BubbleSortTest {

    private int[] inputArray;

    private BubbleSort bubbleSort;

    @BeforeEach
    void setup() {
        inputArray = new int[]{23, 12, 3, 56, 77, 44, 13, 99};

        bubbleSort = new BubbleSort();
    }

    @Test
    void testSort() {
        int[] result = bubbleSort.sort(inputArray);

        assertArrayEquals(new int[]{3, 12, 13, 23, 44, 56, 77, 99}, result);
    }

    @Test
    void testRecursiveSort() {
        bubbleSort.recursiveSort(inputArray, inputArray.length);

        assertArrayEquals(new int[]{3, 12, 13, 23, 44, 56, 77, 99}, inputArray);
    }
}