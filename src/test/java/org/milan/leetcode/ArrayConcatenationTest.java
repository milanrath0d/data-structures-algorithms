package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link ArrayConcatenation}
 *
 * @author Milan Rathod
 */
class ArrayConcatenationTest {

    @Test
    void getConcatenation() {
        ArrayConcatenation arrayConcatenation = new ArrayConcatenation();

        assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, arrayConcatenation.getConcatenation(new int[]{1, 2, 1}));
    }
}