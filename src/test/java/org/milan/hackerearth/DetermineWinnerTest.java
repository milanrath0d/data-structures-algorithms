package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class {@link DetermineWinner}
 *
 * @author Milan Rathod
 */
class DetermineWinnerTest {

    @Test
    void testGetWinner() {
        DetermineWinner determineWinner = new DetermineWinner();

        String winner = determineWinner.getWinner(new long[]{1000, 2000, 3000, 4000},
                new long[]{1, 2, 30, 40},
                new long[]{110, 10, 7, 8},
                new long[]{15, 30, 45, 20});

        assertEquals("Flash", winner);
    }
}