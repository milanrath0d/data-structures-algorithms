package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link CountSquareSumTriples}
 *
 * @author Milan Rathod
 */
class CountSquareSumTriplesTest {

    @Test
    void countTriples() {
        CountSquareSumTriples countSquareSumTriples = new CountSquareSumTriples();

        assertEquals(2, countSquareSumTriples.countTriples(5));

        assertEquals(4, countSquareSumTriples.countTriples(10));
    }
}