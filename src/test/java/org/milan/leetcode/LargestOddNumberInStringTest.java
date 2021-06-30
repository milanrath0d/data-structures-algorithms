package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LargestOddNumberInString}
 *
 * @author Milan Rathod
 */
class LargestOddNumberInStringTest {

    @Test
    void largestOddNumber() {
        LargestOddNumberInString largestOddNumberInString = new LargestOddNumberInString();

        assertEquals("5", largestOddNumberInString.largestOddNumber("52"));

        assertEquals("", largestOddNumberInString.largestOddNumber("4206"));

        assertEquals("35427", largestOddNumberInString.largestOddNumber("35427"));

        assertEquals("239537672423884969653287101",
                largestOddNumberInString.largestOddNumber("239537672423884969653287101"));
    }
}