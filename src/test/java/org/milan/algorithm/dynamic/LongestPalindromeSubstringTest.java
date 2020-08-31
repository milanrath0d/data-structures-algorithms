package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LongestPalindromeSubstring}
 *
 * @author Milan Rathod
 */
class LongestPalindromeSubstringTest {

    @Test
    void testFind() {
        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();

        String result = longestPalindromeSubstring.find("forgeeksskeegfor");

        assertEquals("geeksskeeg", result);
    }

    @Test
    void testFindV2() {
        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();

        String result = longestPalindromeSubstring.findV2("forgeeksskeegfor");

        assertEquals("geeksskeeg", result);
    }
}