package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link SumGame}
 *
 * @author Milan Rathod
 */
class SumGameTest {

    @Test
    void sumGame() {
        SumGame sumGame = new SumGame();

        assertFalse(sumGame.sumGame("5023"));

        assertTrue(sumGame.sumGame("25??"));

        assertTrue(sumGame.sumGame("?3295???"));
    }
}