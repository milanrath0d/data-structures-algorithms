package org.milan.datastructure.subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link LongestSubSequenceWithKChars}
 *
 * @author Milan Rathod
 */
class LongestSubSequenceWithKCharsTest {

    @Test
    void testCompute() {
        LongestSubSequenceWithKChars longestSubSequenceWithKChars = new LongestSubSequenceWithKChars();
        String result = longestSubSequenceWithKChars.compute("geeksforgeeks", 2);

        assertEquals("geeksgeeks", result);
    }
}