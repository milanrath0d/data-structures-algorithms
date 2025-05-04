package org.milan.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LongestRepeatingCharacterReplacement}
 * 
 * @author Milan Rathod
 */
public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void testCharacterReplacement_Example1() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(4, solution.characterReplacement("ABAB", 2));
    }

    @Test
    public void testCharacterReplacement_Example2() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }

    @Test
    public void testCharacterReplacement_EmptyString() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(0, solution.characterReplacement("", 2));
    }

    @Test
    public void testCharacterReplacement_SingleCharacter() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(1, solution.characterReplacement("A", 0));
    }

    @Test
    public void testCharacterReplacement_AllSameCharacters() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(5, solution.characterReplacement("AAAAA", 0));
    }

    @Test
    public void testCharacterReplacement_AllDifferentCharacters() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(3, solution.characterReplacement("ABCDE", 2));
    }

    @Test
    public void testCharacterReplacement_KZero() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(3, solution.characterReplacement("AAABBCD", 0));
    }

    @Test
    public void testCharacterReplacement_KLargerThanStringLength() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(4, solution.characterReplacement("ABCD", 10));
    }

    @Test
    public void testCharacterReplacement_LongerString() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(6, solution.characterReplacement("AAABCDEFAAAAA", 1));
    }

    @Test
    public void testCharacterReplacement_TwoCharacterGroups() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(6, solution.characterReplacement("AAABBBBCCD", 2));
    }

    @Test
    public void testCharacterReplacement_RepeatingPatterns() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(5, solution.characterReplacement("ABABABABC", 2));
    }

    @Test
    public void testCharacterReplacement_ComplexPattern() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertEquals(4, solution.characterReplacement("AABCABBB", 1));
    }
} 