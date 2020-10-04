package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link MonkWatchingFight}
 *
 * @author Milan Rathod
 */
class MonkWatchingFightTest {

    @Test
    void testHeightOfBST() {
        int n = 4;
        int[] arr = new int[]{2, 1, 3, 4};

        MonkWatchingFight monkWatchingFight = new MonkWatchingFight();

        assertEquals(3, monkWatchingFight.heightOfBST(arr));
    }
}