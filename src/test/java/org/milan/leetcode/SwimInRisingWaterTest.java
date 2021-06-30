package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SwimInRisingWater}
 *
 * @author Milan Rathod
 */
class SwimInRisingWaterTest {

    @Test
    void swimInWater() {
        SwimInRisingWater swimInRisingWater = new SwimInRisingWater();

        assertEquals(3, swimInRisingWater.swimInWater(new int[][]{{0, 2}, {1, 3}}));

        assertEquals(16, swimInRisingWater.swimInWater(new int[][]{{0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}}));
    }
}