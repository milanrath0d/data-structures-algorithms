package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link EliminateMonsters}
 *
 * @author Milan Rathod
 */
class EliminateMonstersTest {

    @Test
    void eliminateMaximum() {
        EliminateMonsters eliminateMonsters = new EliminateMonsters();

        assertEquals(3, eliminateMonsters.eliminateMaximum(new int[]{1, 3, 4}, new int[]{1, 1, 1}));

        assertEquals(1, eliminateMonsters.eliminateMaximum(new int[]{1, 1, 2, 3}, new int[]{1, 1, 1, 1}));

        assertEquals(1, eliminateMonsters.eliminateMaximum(new int[]{3, 4, 2}, new int[]{5, 2, 3}));
    }
}