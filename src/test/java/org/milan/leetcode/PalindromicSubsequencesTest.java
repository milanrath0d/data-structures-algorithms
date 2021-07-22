package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link PalindromicSubsequences}
 *
 * @author Milan Rathod
 */
class PalindromicSubsequencesTest {

    @Test
    void countPalindromicSubsequence() {
        PalindromicSubsequences palindromicSubsequences = new PalindromicSubsequences();

        assertEquals(3, palindromicSubsequences.countPalindromicSubsequence("aabca"));

        assertEquals(1, palindromicSubsequences.countPalindromicSubsequence("aca"));

        assertEquals(4, palindromicSubsequences.countPalindromicSubsequence("bbcbaba"));

        assertEquals(3, palindromicSubsequences.countPalindromicSubsequence("ckafnafqo"));
    }
}