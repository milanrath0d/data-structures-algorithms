package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ElectionWinner}
 *
 * @author Milan Rathod
 */
class ElectionWinnerTest {

    @Test
    void find() {
        String[] votes = {"john", "johnny", "jackie", "jamie", "jamie", "john"};

        ElectionWinner electionWinner = new ElectionWinner();

        assertEquals("jamie", electionWinner.find(votes));
    }
}