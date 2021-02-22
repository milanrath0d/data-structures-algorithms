package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link BatmanAndTickTackToe}
 *
 * @author Milan Rathod
 */
class BatmanAndTickTackToeTest {

    @Test
    void testIsWonScenarioAvailable() {
        char[][] matrix = {
                {'x', '.', '.', 'x'},
                {'.', 'o', 'x', '.'},
                {'o', '.', '.', '.'},
                {'o', 'x', 'o', '.'}
        };

        BatmanAndTickTackToe batmanAndTickTackToe = new BatmanAndTickTackToe();

        boolean result = batmanAndTickTackToe.isWinningScenarioAvailable(matrix);

        assertTrue(result);
    }
}