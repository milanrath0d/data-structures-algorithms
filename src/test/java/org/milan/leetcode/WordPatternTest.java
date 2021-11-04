package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link WordPattern}
 *
 * @author Milan Rathod
 */
class WordPatternTest {

    @Test
    void wordPattern() {
        WordPattern wordPattern = new WordPattern();

        assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));

        assertFalse(wordPattern.wordPattern("abba", "dog cat cat fish"));

        assertFalse(wordPattern.wordPattern("aaaa", "dog cat cat dog"));

        assertFalse(wordPattern.wordPattern("abba", "dog dog dog dog"));
    }

    @Test
    void wordPatternV2() {
        WordPattern wordPattern = new WordPattern();

        assertTrue(wordPattern.wordPatternV2("abba", "dog cat cat dog"));

        assertFalse(wordPattern.wordPatternV2("abba", "dog cat cat fish"));

        assertFalse(wordPattern.wordPatternV2("aaaa", "dog cat cat dog"));

        assertFalse(wordPattern.wordPatternV2("abba", "dog dog dog dog"));
    }
}