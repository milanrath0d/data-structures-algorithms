package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Milan Rathod
 */
class MaximumProductSubArrayTest {

    @Test
    void find() {
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();

        assertEquals(6, maximumProductSubArray.find(new int[]{2, 3, -2, 4}));

        assertEquals(0, maximumProductSubArray.find(new int[]{-2, 0, -1}));
    }
}