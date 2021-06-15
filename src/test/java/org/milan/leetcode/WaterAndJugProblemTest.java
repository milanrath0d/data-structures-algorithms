package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link WaterAndJugProblem}
 *
 * @author Milan Rathod
 */
class WaterAndJugProblemTest {

    @Test
    void canMeasureWater() {
        WaterAndJugProblem waterAndJugProblem = new WaterAndJugProblem();

        assertTrue(waterAndJugProblem.canMeasureWater(3, 5, 4));

        assertFalse(waterAndJugProblem.canMeasureWater(2, 6, 5));

        assertTrue(waterAndJugProblem.canMeasureWater(1, 2, 3));

        assertFalse(waterAndJugProblem.canMeasureWater(3, 5, 9));
    }
}