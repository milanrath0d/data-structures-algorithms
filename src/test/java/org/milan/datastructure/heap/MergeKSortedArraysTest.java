package org.milan.datastructure.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link MergeKSortedArrays}
 *
 * @author Milan Rathod
 */
class MergeKSortedArraysTest {

    @Test
    void testMerge() {
        int[][] input = {{2, 34},
                {1, 9, 20},
                {10, 33}};

        MergeKSortedArrays mergeKSortedArrays = new MergeKSortedArrays();

        int[] result = mergeKSortedArrays.merge(input, input.length);

        assertArrayEquals(new int[]{1, 2, 9, 10, 20, 33, 34}, result);
    }
}