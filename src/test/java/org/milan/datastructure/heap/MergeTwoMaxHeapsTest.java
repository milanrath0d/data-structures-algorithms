package org.milan.datastructure.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link MergeTwoMaxHeaps}
 *
 * @author Milan Rathod
 */
class MergeTwoMaxHeapsTest {

    @Test
    void testMerge() {
        int[] a = {10, 5, 6, 2};
        int[] b = {12, 7, 9};

        MergeTwoMaxHeaps mergeTwoMaxHeaps = new MergeTwoMaxHeaps(a.length + b.length);

        int[] mergedHeap = mergeTwoMaxHeaps.merge(a, b, a.length, b.length);

        assertArrayEquals(new int[]{12, 10, 9, 2, 5, 7, 6}, mergedHeap);
    }
}