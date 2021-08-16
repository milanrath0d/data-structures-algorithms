package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link Closest3Sum}
 *
 * @author Milan Rathod
 */
class Closest3SumTest {

    @Test
    void threeSumClosest() {
        Closest3Sum closest3Sum = new Closest3Sum();

        assertEquals(2, closest3Sum.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}