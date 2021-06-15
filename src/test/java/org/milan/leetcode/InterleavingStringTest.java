package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link InterleavingString}
 *
 * @author Milan Rathod
 */
class InterleavingStringTest {

    @Test
    void isInterleave() {
        InterleavingString interleavingString = new InterleavingString();

        assertTrue(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));

        assertFalse(interleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc"));

        assertTrue(interleavingString.isInterleave("", "", ""));
    }
}