package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link MergeIntervals}
 *
 * @author Milan Rathod
 */
class MergeIntervalsTest {

    @Test
    void merge() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        int[][] result = mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});

        assertTrue(Arrays.deepEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, result));

        assertTrue(Arrays.deepEquals(new int[][]{{1, 5}}, mergeIntervals.merge(new int[][]{{1, 4}, {4, 5}})));

        assertTrue(Arrays.deepEquals(new int[][]{{1, 4}}, mergeIntervals.merge(new int[][]{{1, 4}, {2, 3}})));
    }

}