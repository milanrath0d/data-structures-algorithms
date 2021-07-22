package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaxSumRectangle}
 *
 * @author Milan Rathod
 */
class MaxSumRectangleTest {

    @Test
    void maxSumSubMatrix() {
        MaxSumRectangle maxSumRectangle = new MaxSumRectangle();

        int result = maxSumRectangle.maxSumSubMatrix(new int[][]{{1, 0, 1}, {0, -2, 3}}, 2);

        assertEquals(2, result);

        assertEquals(3, maxSumRectangle.maxSumSubMatrix(new int[][]{{2, 2, -1}}, 3));
    }
}