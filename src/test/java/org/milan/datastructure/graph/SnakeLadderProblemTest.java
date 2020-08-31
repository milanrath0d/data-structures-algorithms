package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SnakeLadderProblem}
 *
 * @author Milan Rathod
 */
class SnakeLadderProblemTest {

    @Test
    void testGetMinDiceThrows() {
        int N = 30;
        int[] moves = new int[N];
        Arrays.fill(moves, -1);

        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        SnakeLadderProblem snakeLadderProblem = new SnakeLadderProblem();

        int result = snakeLadderProblem.getMinDiceThrows(moves, N);

        assertEquals(3, result);
    }
}