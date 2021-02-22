package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReachGivenScoreTest {

    @Test
    void count() {
        ReachGivenScore reachGivenScore = new ReachGivenScore();

        int count = reachGivenScore.count(20);

        assertEquals(4, count);

        count = reachGivenScore.count(13);

        assertEquals(2, count);
    }
}