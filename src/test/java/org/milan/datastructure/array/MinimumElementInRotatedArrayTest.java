package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinimumElementInRotatedArray}
 *
 * @author Milan Rathod
 */
class MinimumElementInRotatedArrayTest {

    private MinimumElementInRotatedArray minimumElementInRotatedArray;

    @BeforeEach
    void setup() {
        minimumElementInRotatedArray = new MinimumElementInRotatedArray();
    }

    @Test
    void testFindMinimum_ArrayIsRotated() {
        int[] input = new int[]{2, 3, 4, 5, 6, 7, 8, 1};

        int result = minimumElementInRotatedArray.findMinimum(input);

        assertEquals(1, result);
    }

    @Test
    void testFindMinimum_ArrayIsNotRotated() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};

        int result = minimumElementInRotatedArray.findMinimum(input);

        assertEquals(1, result);
    }
}