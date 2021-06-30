package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaxConsecutiveOnes}
 *
 * @author Milan Rathod
 */
class MaxConsecutiveOnesTest {

    @Test
    void findMaxConsecutiveOnes() {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

        assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));

        assertEquals(2, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}