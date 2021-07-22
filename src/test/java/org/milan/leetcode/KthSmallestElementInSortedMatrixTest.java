package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link KthSmallestElementInSortedMatrix}
 *
 * @author Milan Rathod
 */
class KthSmallestElementInSortedMatrixTest {

    @Test
    void kthSmallest() {
        KthSmallestElementInSortedMatrix kthSmallestElementInSortedMatrix = new
                KthSmallestElementInSortedMatrix();

        assertEquals(13, kthSmallestElementInSortedMatrix.kthSmallest(
                new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8
        ));

        assertEquals(-5, kthSmallestElementInSortedMatrix.kthSmallest(
                new int[][]{{-5}}, 1
        ));
    }

    @Test
    void kthSmallestV2() {
        KthSmallestElementInSortedMatrix kthSmallestElementInSortedMatrix = new
                KthSmallestElementInSortedMatrix();

        assertEquals(13, kthSmallestElementInSortedMatrix.kthSmallestV2(
                new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8
        ));

        assertEquals(-5, kthSmallestElementInSortedMatrix.kthSmallestV2(
                new int[][]{{-5}}, 1
        ));
    }
}