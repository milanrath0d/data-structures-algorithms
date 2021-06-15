package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SingleUseStones}
 *
 * @author Milan Rathod
 */
class SingleUseStonesTest {

    @Test
    void maxFrogsCrossingRiver() {
        SingleUseStones singleUseStones = new SingleUseStones();

        int result = singleUseStones.maxFrogsCrossingRiver(10, 5, new int[]{0, 0, 1, 0, 2, 0, 0, 1, 0});

        assertEquals(3, result);

        result = singleUseStones.maxFrogsCrossingRiver(10, 3, new int[]{1, 1, 1, 1, 2, 1, 1, 1, 1});

        assertEquals(3, result);
    }
}