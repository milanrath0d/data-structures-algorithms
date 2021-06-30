package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MatchingSubsequences}
 *
 * @author Milan Rathod
 */
class MatchingSubsequencesTest {

    @Test
    void find() {
        MatchingSubsequences matchingSubsequences = new MatchingSubsequences();

        assertEquals(3, matchingSubsequences.find("abcde", new String[]{"a", "bb", "acd", "ace"}));

        assertEquals(2, matchingSubsequences.find("dsahjpjauf",
                new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}));
    }
}