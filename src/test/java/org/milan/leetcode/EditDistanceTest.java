package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link EditDistance}
 *
 * @author Milan Rathod
 */
class EditDistanceTest {

    @Test
    void minDistanceUsingMemoization() {
        EditDistance editDistance = new EditDistance();

        // Example 1 from LeetCode: word1 = "horse", word2 = "ros"
        // Explanation:
        // horse -> rorse (replace 'h' with 'r')
        // rorse -> rose (remove 'r')
        // rose -> ros (remove 'e')
        assertEquals(3, editDistance.minDistanceUsingMemoization("horse", "ros"));

        // Example 2 from LeetCode: word1 = "intention", word2 = "execution"
        // Explanation:
        // intention -> inention (remove 't')
        // inention -> enention (replace 'i' with 'e')
        // enention -> exention (replace 'n' with 'x')
        // exention -> exection (replace 'n' with 'c')
        // exection -> execution (insert 'u')
        assertEquals(5, editDistance.minDistanceUsingMemoization("intention", "execution"));

        // Additional test cases
        // Empty strings
        assertEquals(0, editDistance.minDistanceUsingMemoization("", ""));
        
        // One empty string
        assertEquals(5, editDistance.minDistanceUsingMemoization("hello", ""));
        assertEquals(5, editDistance.minDistanceUsingMemoization("", "world"));
        
        // Same string
        assertEquals(0, editDistance.minDistanceUsingMemoization("abc", "abc"));
        
        // All operations needed
        // cat -> dog
        // cat -> dat (replace 'c' with 'd')
        // dat -> dot (replace 'a' with 'o')
        // dot -> dog (replace 't' with 'g')
        assertEquals(3, editDistance.minDistanceUsingMemoization("cat", "dog"));
        
        // Insert only: "ab" -> "abc"
        assertEquals(1, editDistance.minDistanceUsingMemoization("ab", "abc"));
        
        // Delete only: "abc" -> "ab"
        assertEquals(1, editDistance.minDistanceUsingMemoization("abc", "ab"));
        
        // Replace only: "ab" -> "ac"
        assertEquals(1, editDistance.minDistanceUsingMemoization("ab", "ac"));
        
        // Complex case with multiple operations
        // "algorithm" -> "logarithm"
        // algorithm -> lgorithm (replace 'a' with 'l')
        // lgorithm -> lgorithm (no change)
        // lgorithm -> logarithm (insert 'a' after 'log')
        assertEquals(3, editDistance.minDistanceUsingMemoization("algorithm", "logarithm"));
        
        // Case with many repeated characters
        // "aaaaaabbbb" -> "aabbbbbccc"
        assertEquals(7, editDistance.minDistanceUsingMemoization("aaaaaabbbb", "aabbbbbccc"));
        
        // Edge case: Single character difference
        assertEquals(1, editDistance.minDistanceUsingMemoization("a", "b"));
    }

    @Test
    void minDistanceUsingTabulation() {
        EditDistance editDistance = new EditDistance();

        // Example 1 from LeetCode: word1 = "horse", word2 = "ros"
        // Explanation:
        // horse -> rorse (replace 'h' with 'r')
        // rorse -> rose (remove 'r')
        // rose -> ros (remove 'e')
        assertEquals(3, editDistance.minDistanceUsingTabulation("horse", "ros"));

        // Example 2 from LeetCode: word1 = "intention", word2 = "execution"
        // Explanation:
        // intention -> inention (remove 't')
        // inention -> enention (replace 'i' with 'e')
        // enention -> exention (replace 'n' with 'x')
        // exention -> exection (replace 'n' with 'c')
        // exection -> execution (insert 'u')
        assertEquals(5, editDistance.minDistanceUsingTabulation("intention", "execution"));

        // Additional test cases
        // Empty strings
        assertEquals(0, editDistance.minDistanceUsingTabulation("", ""));

        // One empty string
        assertEquals(5, editDistance.minDistanceUsingTabulation("hello", ""));
        assertEquals(5, editDistance.minDistanceUsingTabulation("", "world"));

        // Same string
        assertEquals(0, editDistance.minDistanceUsingTabulation("abc", "abc"));

        // All operations needed
        // cat -> dog
        // cat -> dat (replace 'c' with 'd')
        // dat -> dot (replace 'a' with 'o')
        // dot -> dog (replace 't' with 'g')
        assertEquals(3, editDistance.minDistanceUsingTabulation("cat", "dog"));

        // Insert only: "ab" -> "abc"
        assertEquals(1, editDistance.minDistanceUsingTabulation("ab", "abc"));

        // Delete only: "abc" -> "ab"
        assertEquals(1, editDistance.minDistanceUsingTabulation("abc", "ab"));

        // Replace only: "ab" -> "ac"
        assertEquals(1, editDistance.minDistanceUsingTabulation("ab", "ac"));

        // Complex case with multiple operations
        // "algorithm" -> "logarithm"
        // algorithm -> lgorithm (replace 'a' with 'l')
        // lgorithm -> lgorithm (no change)
        // lgorithm -> logarithm (insert 'a' after 'log')
        assertEquals(3, editDistance.minDistanceUsingTabulation("algorithm", "logarithm"));

        // Case with many repeated characters
        // "aaaaaabbbb" -> "aabbbbbccc"
        assertEquals(7, editDistance.minDistanceUsingTabulation("aaaaaabbbb", "aabbbbbccc"));

        // Edge case: Single character difference
        assertEquals(1, editDistance.minDistanceUsingTabulation("a", "b"));
    }
}
