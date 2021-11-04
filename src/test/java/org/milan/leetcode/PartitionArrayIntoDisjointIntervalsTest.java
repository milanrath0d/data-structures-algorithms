package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PartitionArrayIntoDisjointIntervals}
 *
 * @author Milan Rathod
 */
class PartitionArrayIntoDisjointIntervalsTest {

    @Test
    void partitionDisjoint() {
        PartitionArrayIntoDisjointIntervals partitionArrayIntoDisjointIntervals =
            new PartitionArrayIntoDisjointIntervals();

        assertEquals(3, partitionArrayIntoDisjointIntervals.partitionDisjoint(new int[]{5, 0, 3, 8, 6}));

        assertEquals(4, partitionArrayIntoDisjointIntervals.partitionDisjoint(new int[]{1, 1, 1, 0, 6, 12}));
    }
}