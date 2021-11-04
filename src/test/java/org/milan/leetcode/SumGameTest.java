package org.milan.leetcode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SumGame}
 *
 * @author Milan Rathod
 */
class SumGameTest {

    @Test
    @Disabled
    void sumGame() {
        SumGame sumGame = new SumGame();

        assertFalse(sumGame.sumGame("5023"));

        assertTrue(sumGame.sumGame("25??"));

        assertTrue(sumGame.sumGame("?3295???"));
    }
}