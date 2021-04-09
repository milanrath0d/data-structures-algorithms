package org.milan.algorithm.searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BinarySearch}
 *
 * @author Milan Rathod
 */
class BinarySearchTest {

    private BinarySearch binarySearch;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        binarySearch = new BinarySearch();

        inputArray = new int[]{2, 4, 6, 8, 9, 12, 15, 18};
    }

    @Test
    void testSearch_ElementIsPresent() {
        int result = binarySearch.search(inputArray, 12);

        assertEquals(5, result);
    }

    @Test
    void testSearch_ElementIsNotPresent() {
        int result = binarySearch.search(inputArray, 10);

        assertEquals(-1, result);
    }

    @Test
    void testSearchRecursive_ElementIsPresent() {
        int result = binarySearch.searchRecursive(inputArray, 12);

        assertEquals(5, result);
    }

    @Test
    void testSearchRecursive_ElementIsNotPresent() {
        int result = binarySearch.search(inputArray, 10);

        assertEquals(-1, result);
    }
}