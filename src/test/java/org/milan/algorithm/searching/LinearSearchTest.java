package org.milan.algorithm.searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link LinearSearch}
 *
 * @author Milan Rathod
 */
class LinearSearchTest {

    private LinearSearch linearSearch;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        linearSearch = new LinearSearch();

        inputArray = new int[]{2, 4, 6, 8, 9, 12, 15, 18};
    }

    @Test
    void testSearch_ElementIsPresent() {
        int result = linearSearch.search(inputArray, 12);

        assertEquals(result, 5);
    }

    @Test
    void testSearch_ElementIsNotPresent() {
        int result = linearSearch.search(inputArray, 5);

        assertEquals(result, -1);
    }

}