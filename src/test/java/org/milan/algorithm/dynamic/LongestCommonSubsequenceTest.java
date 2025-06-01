package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LongestCommonSubsequence}
 *
 * @author Milan Rathod
 */
class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence;

    @BeforeEach
    void setUp() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }

    @Test
    @DisplayName("LeetCode Example 1: text1 = 'abcde', text2 = 'ace'")
    void testLeetCodeExample1() {
        // LeetCode Example 1
        String text1 = "abcde";
        String text2 = "ace";

        int resultRecursive = longestCommonSubsequence.lcsByRecursion(text1, text2);
        int resultDynamic = longestCommonSubsequence.lcsByDynamic(text1, text2);
        int resultDynamicV2 = longestCommonSubsequence.lcsByDynamicV2(text1, text2);
        String resultString = longestCommonSubsequence.findLcs(text1, text2);

        assertEquals(3, resultRecursive);
        assertEquals(3, resultDynamic);
        assertEquals(3, resultDynamicV2);
        assertEquals("ace", resultString);
    }

    @Test
    @DisplayName("LeetCode Example 2: text1 = 'abc', text2 = 'abc'")
    void testLeetCodeExample2() {
        // LeetCode Example 2
        String text1 = "abc";
        String text2 = "abc";

        int resultRecursive = longestCommonSubsequence.lcsByRecursion(text1, text2);
        int resultDynamic = longestCommonSubsequence.lcsByDynamic(text1, text2);
        int resultDynamicV2 = longestCommonSubsequence.lcsByDynamicV2(text1, text2);
        String resultString = longestCommonSubsequence.findLcs(text1, text2);

        assertEquals(3, resultRecursive);
        assertEquals(3, resultDynamic);
        assertEquals(3, resultDynamicV2);
        assertEquals("abc", resultString);
    }

    @Test
    @DisplayName("LeetCode Example 3: text1 = 'abc', text2 = 'def'")
    void testLeetCodeExample3() {
        // LeetCode Example 3
        String text1 = "abc";
        String text2 = "def";

        int resultRecursive = longestCommonSubsequence.lcsByRecursion(text1, text2);
        int resultDynamic = longestCommonSubsequence.lcsByDynamic(text1, text2);
        int resultDynamicV2 = longestCommonSubsequence.lcsByDynamicV2(text1, text2);
        String resultString = longestCommonSubsequence.findLcs(text1, text2);

        assertEquals(0, resultRecursive);
        assertEquals(0, resultDynamic);
        assertEquals(0, resultDynamicV2);
        assertEquals("", resultString);
    }

    @ParameterizedTest(name = "{index}: {0}, {1} => {2}")
    @MethodSource("lcsTestCases")
    void testMultipleLcsCases(String text1, String text2, int expectedLength) {
        assertEquals(expectedLength, longestCommonSubsequence.lcsByDynamic(text1, text2));
        assertEquals(expectedLength, longestCommonSubsequence.lcsByRecursion(text1, text2));
        assertEquals(expectedLength, longestCommonSubsequence.lcsByDynamicV2(text1, text2));
    }

    static Stream<Arguments> lcsTestCases() {
        return Stream.of(
            // Basic cases
            Arguments.of("abcde", "ace", 3),
            Arguments.of("abc", "abc", 3),
            Arguments.of("abc", "def", 0),
            // Empty string cases
            Arguments.of("", "abc", 0),
            Arguments.of("abc", "", 0),
            Arguments.of("", "", 0),
            // Single character cases
            Arguments.of("a", "a", 1),
            Arguments.of("a", "b", 0),
            // Repetitive character cases
            Arguments.of("aaaa", "aa", 2),
            Arguments.of("aaa", "aaa", 3),
            // Longer examples
            Arguments.of("bsbininm", "jmjkbkjkv", 1),
            Arguments.of("oxcpqrsvwf", "shmtulqrypy", 2),
            Arguments.of("pmjghexybyrgzczy", "hafcdqbgncrcbihkd", 4),
            // Palindromic cases
            Arguments.of("abcba", "abcba", 5),
            Arguments.of("abcba", "bacab", 3),
            // Case sensitivity tests
            Arguments.of("AbCdEf", "aBcDeF", 0),
            // Subsequence cases
            Arguments.of("programming", "gaming", 6),
            Arguments.of("dynamic", "programming", 3)
        );
    }

    @Test
    @DisplayName("Test very long strings")
    void testLongStrings() {
        String text1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String text2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        // Only testing dynamic method to avoid long recursion
        int resultDynamic = longestCommonSubsequence.lcsByDynamic(text1, text2);
        int resultDynamicV2 = longestCommonSubsequence.lcsByDynamicV2(text1, text2);
        String resultString = longestCommonSubsequence.findLcs(text1, text2);

        assertEquals(text1.length(), resultDynamic);
        assertEquals(text1.length(), resultDynamicV2);
        assertEquals(text1, resultString);
    }

    @Test
    @DisplayName("Test with interleaved characters")
    void testInterleavedCharacters() {
        String text1 = "adbecf";
        String text2 = "abcdef";

        int resultRecursive = longestCommonSubsequence.lcsByRecursion(text1, text2);
        int resultDynamic = longestCommonSubsequence.lcsByDynamic(text1, text2);
        int resultDynamicV2 = longestCommonSubsequence.lcsByDynamicV2(text1, text2);
        String resultString = longestCommonSubsequence.findLcs(text1, text2);

        assertEquals(4, resultRecursive);
        assertEquals(4, resultDynamic);
        assertEquals(4, resultDynamicV2);
        // Note: The actual LCS string could be "abcf", "abef", or "adef" depending on implementation
        assertEquals(4, resultString.length());
    }

    @Test
    @DisplayName("Test lcsByDynamicV2 with specific cases")
    void testLcsByDynamicV2() {
        // Test with strings that have overlapping subproblems (good for testing memoization)
        String text1 = "ababababab";
        String text2 = "babababa";
        assertEquals(8, longestCommonSubsequence.lcsByDynamicV2(text1, text2));
        
        // Test with strings where optimal substructure is clearly visible
        text1 = "aabcc";
        text2 = "dbbca";
        assertEquals(2, longestCommonSubsequence.lcsByDynamicV2(text1, text2));
        
        // Test with strings that would cause excessive recursion without memoization
        text1 = "aaaaaaaaaaaaaaaaaaaaaaaaa";
        text2 = "aaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals(25, longestCommonSubsequence.lcsByDynamicV2(text1, text2));
        
        // Test with palindromic strings
        text1 = "racecar";
        text2 = "racecar";
        assertEquals(7, longestCommonSubsequence.lcsByDynamicV2(text1, text2));
        
        // Test with strings that have LCS at different positions
        text1 = "xabcdy";
        text2 = "zabcdw";
        assertEquals(4, longestCommonSubsequence.lcsByDynamicV2(text1, text2));
    }

}