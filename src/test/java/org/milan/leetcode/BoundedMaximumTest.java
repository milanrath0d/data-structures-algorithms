package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BoundedMaximum}
 *
 * @author Milan Rathod
 */
class BoundedMaximumTest {

    @Test
    void numSubarrayBoundedMax() {
        BoundedMaximum boundedMaximum = new BoundedMaximum();

        int result = boundedMaximum.numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3);

        assertEquals(3, result);
    }
}