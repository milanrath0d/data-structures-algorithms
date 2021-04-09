package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinimumElementInRotatedArray}
 *
 * @author Milan Rathod
 */
class MinimumElementInSortedRotatedArrayTest {

    @Test
    void testFindMinimum() {

        MinimumElementInSortedRotatedArray minimumElementInSortedRotatedArray = new MinimumElementInSortedRotatedArray();

        int[] arr = new int[]{5, 6, 1, 2, 3, 4};

        int result = minimumElementInSortedRotatedArray.findMinimum(arr);

        assertEquals(1, result);

        arr = new int[]{1, 2, 3, 4};

        result = minimumElementInSortedRotatedArray.findMinimum(arr);

        assertEquals(1, result);

        arr = new int[]{2, 1};

        result = minimumElementInSortedRotatedArray.findMinimum(arr);

        assertEquals(1, result);

        arr = new int[]{3, 1, 2, 2, 3};

        result = minimumElementInSortedRotatedArray.findMinimum(arr);

        assertEquals(1, result);
    }
}