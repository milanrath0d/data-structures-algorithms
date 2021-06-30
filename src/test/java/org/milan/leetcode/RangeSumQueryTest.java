package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link RangeSumQuery}
 *
 * @author Milan Rathod
 */
class RangeSumQueryTest {

    @Test
    void testOperations() {
        int[] nums = new int[]{1, 3, 5};
        RangeSumQuery rangeSumQuery = new RangeSumQuery(nums);

        assertEquals(9, rangeSumQuery.sumRange(0, 2));

        rangeSumQuery.update(1, 2);

        assertEquals(8, rangeSumQuery.sumRange(0, 2));
    }

}