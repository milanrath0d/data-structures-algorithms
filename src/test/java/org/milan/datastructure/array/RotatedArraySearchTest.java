package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link RotatedArraySearch}
 *
 * @author Milan Rathod
 */
class RotatedArraySearchTest {

    private RotatedArraySearch rotatedArraySearch;

    @BeforeEach
    void setup() {
        rotatedArraySearch = new RotatedArraySearch();
    }

    @Test
    void testFindElement_ElementIsPresent() {
        int[] inputArray = {3, 4, 5, 6, 1, 2};

        int result = rotatedArraySearch.findElement(inputArray, 4);

        assertEquals(1, result);
    }

    @Test
    void testFindElement_ElementIsNotPresent() {
        int[] inputArray = {3, 4, 5, 6, 1, 2};

        int result = rotatedArraySearch.findElement(inputArray, 7);

        assertEquals(-1, result);
    }
}