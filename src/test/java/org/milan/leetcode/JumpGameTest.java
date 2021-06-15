package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link JumpGame}
 *
 * @author Milan Rathod
 */
class JumpGameTest {

    @Test
    void maxJumps() {
        JumpGame jumpGame = new JumpGame();

        assertEquals(7, jumpGame.maxJumps(new int[]{1, -1, -2, 4, -7, 3}, 2));

        assertEquals(17, jumpGame.maxJumps(new int[]{10, -5, -2, 4, 0, 3}, 3));

        assertEquals(0, jumpGame.maxJumps(new int[]{1, -5, -20, 4, -1, 3, -6, -3}, 2));
    }

    @Test
    void maxJumpsV2() {
        JumpGame jumpGame = new JumpGame();

        assertEquals(7, jumpGame.maxJumpsV2(new int[]{1, -1, -2, 4, -7, 3}, 2));

        assertEquals(17, jumpGame.maxJumpsV2(new int[]{10, -5, -2, 4, 0, 3}, 3));

        assertEquals(0, jumpGame.maxJumpsV2(new int[]{1, -5, -20, 4, -1, 3, -6, -3}, 2));
    }

}