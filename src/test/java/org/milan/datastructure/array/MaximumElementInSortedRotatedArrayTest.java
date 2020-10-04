package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumElementInSortedRotatedArrayTest {

    @Test
    void testFindMaximum() {

        MaximumElementInSortedRotatedArray maximumElementInSortedRotatedArray = new MaximumElementInSortedRotatedArray();

        int[] arr = new int[]{5, 6, 1, 2, 3, 4};

        int result = maximumElementInSortedRotatedArray.findMaximum(arr);

        assertEquals(6, result);

        arr = new int[]{1, 2, 3, 4};

        result = maximumElementInSortedRotatedArray.findMaximum(arr);

        assertEquals(4, result);

        arr = new int[]{2, 1};

        result = maximumElementInSortedRotatedArray.findMaximum(arr);

        assertEquals(2, result);

        arr = new int[]{3, 1, 2, 2, 3};

        result = maximumElementInSortedRotatedArray.findMaximum(arr);

        assertEquals(3, result);
    }

}