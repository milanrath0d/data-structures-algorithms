package org.milan.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubStringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring_NormalCase() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testLengthOfLongestSubstring_AllRepeatingChars() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testLengthOfLongestSubstring_MixedCase() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testLengthOfLongestSubstring_EmptyString() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    public void testLengthOfLongestSubstring_SingleChar() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    public void testLengthOfLongestSubstring_AllUniqueChars() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(5, solution.lengthOfLongestSubstring("abcde"));
    }

    @Test
    public void testLengthOfLongestSubstring_RepeatAtEnd() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(3, solution.lengthOfLongestSubstring("abca"));
    }

    @Test
    public void testLengthOfLongestSubstring_LongerSequence() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(11, solution.lengthOfLongestSubstring("abcdefghijkabcde"));
    }
    
    @Test
    public void testLengthOfLongestSubstring_UppercaseChars() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(4, solution.lengthOfLongestSubstring("AbCdA"));
    }
    
    @Test
    public void testLengthOfLongestSubstring_MixedCharTypes() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(10, solution.lengthOfLongestSubstring("aB1@c dEf2"));
    }
    
    @Test
    public void testLengthOfLongestSubstring_Symbols() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(10, solution.lengthOfLongestSubstring("!@#$%^&*()!"));
    }
    
    @Test
    public void testLengthOfLongestSubstring_WithSpaces() {
        LongestSubStringWithoutRepeatingCharacters solution = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(6, solution.lengthOfLongestSubstring("Hello World"));
    }
} 