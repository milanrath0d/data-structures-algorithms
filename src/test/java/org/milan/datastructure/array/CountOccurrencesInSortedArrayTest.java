package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link CountOccurrencesInSortedArray}
 *
 * @author Milan Rathod
 */
class CountOccurrencesInSortedArrayTest {

    @Test
    void testCount() {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};

        CountOccurrencesInSortedArray countOccurrencesInSortedArray = new CountOccurrencesInSortedArray();

        int result = countOccurrencesInSortedArray.count(arr, 2);

        assertEquals(4, result);

        result = countOccurrencesInSortedArray.count(arr, 4);

        assertEquals(0, result);
    }

    @Test
    void testCountV2() {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};

        CountOccurrencesInSortedArray countOccurrencesInSortedArray = new CountOccurrencesInSortedArray();

        int result = countOccurrencesInSortedArray.countV2(arr, 2);

        assertEquals(4, result);

        result = countOccurrencesInSortedArray.countV2(arr, 4);

        assertEquals(0, result);
    }
}