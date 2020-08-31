package org.milan.geeksforgeeks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinMaxCandies}
 *
 * @author Milan Rathod
 */
class MinMaxCandiesTest {

    private MinMaxCandies minMaxCandies;

    private int[] inputArray;

    @BeforeEach
    void setUp() {
        inputArray = new int[]{3, 2, 1, 4};
        minMaxCandies = new MinMaxCandies();
    }

    @Test
    void testGetMinAmount() {
        int result = minMaxCandies.getMinAmount(inputArray, 2);
        assertEquals(3, result);
    }

    @Test
    void testGetMaxAmount() {
        int result = minMaxCandies.getMaxAmount(inputArray, 2);
        assertEquals(7, result);
    }
}