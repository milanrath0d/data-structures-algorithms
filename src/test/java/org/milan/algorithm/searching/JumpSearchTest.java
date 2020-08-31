package org.milan.algorithm.searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link JumpSearch}
 *
 * @author Milan Rathod
 */
class JumpSearchTest {

    private JumpSearch jumpSearch;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        jumpSearch = new JumpSearch();

        inputArray = new int[]{2, 4, 6, 8, 9, 12, 15, 18, 20, 24, 26, 30, 35, 38};
    }

    @Test
    void testSearch_ElementIsPresent() {
        int result = jumpSearch.search(inputArray, 12);

        assertEquals(result, 5);
    }

    @Test
    void testSearch_ElementIsNotPresent() {
        int result = jumpSearch.search(inputArray, 5);

        assertEquals(result, -1);
    }
}