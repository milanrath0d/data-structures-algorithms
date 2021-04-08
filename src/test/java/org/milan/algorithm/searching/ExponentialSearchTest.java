package org.milan.algorithm.searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ExponentialSearch}
 *
 * @author Milan Rathod
 */
class ExponentialSearchTest {

    private ExponentialSearch exponentialSearch;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        exponentialSearch = new ExponentialSearch();

        inputArray = new int[]{2, 4, 6, 8, 9, 12, 15, 18};
    }

    @Test
    void testSearch_WhenElementIsPresent() {
        int result = exponentialSearch.search(inputArray, 12);

        assertEquals(result, 5);
    }

    @Test
    void testSearch_WhenElementIsNotPresent() {
        int result = exponentialSearch.search(inputArray, 5);

        assertEquals(result, -3);
    }
}