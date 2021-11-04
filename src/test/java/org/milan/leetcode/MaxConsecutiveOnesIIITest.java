package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaxConsecutiveOnes}
 *
 * @author Milan Rathod
 */
class MaxConsecutiveOnesIIITest {

    @Test
    void longestOnes() {
        MaxConsecutiveOnesIII maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();

        assertEquals(5, maxConsecutiveOnesIII.longestOnes(new int[]{1, 1, 0, 0, 0, 1, 1, 1, 0}, 2));

        assertEquals(6, maxConsecutiveOnesIII.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));

        assertEquals(10, maxConsecutiveOnesIII.longestOnes(
            new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }
}