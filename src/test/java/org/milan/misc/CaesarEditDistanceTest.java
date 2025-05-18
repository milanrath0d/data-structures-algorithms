package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link CaesarEditDistance}
 * 
 * @author Milan Rathod
 */
public class CaesarEditDistanceTest {

    @Test
    public void testEditDistance_Examples() {
        // Test with common examples
        assertEquals(4, CaesarEditDistance.editDistance("abc", "gzu"));
        assertEquals(2, CaesarEditDistance.editDistance("www", "ssh"));
    }

    @Test
    public void testEditDistance_EdgeCases() {
        // Empty strings
        assertEquals(0, CaesarEditDistance.editDistance("", ""));
        // One empty string
        assertEquals(3, CaesarEditDistance.editDistance("", "abc"));
        assertEquals(3, CaesarEditDistance.editDistance("xyz", ""));
        // Identical strings
        assertEquals(0, CaesarEditDistance.editDistance("hello", "hello"));
    }

    @Test
    public void testEditDistance_DifferentLengths() {
        // Different length strings
        assertEquals(1, CaesarEditDistance.editDistance("abc", "abcd"));
        assertEquals(1, CaesarEditDistance.editDistance("abcd", "abc"));
    }

    @Test
    public void testEditDistance_WithSpecialCharacters() {
        // Special characters - note that the current implementation shifts all chars
        // including non-alphabetic ones
        assertEquals(0, CaesarEditDistance.editDistance("a!b", "a!b"));
        assertEquals(4, CaesarEditDistance.editDistance("a!b", "z!c"));
    }

    @Test
    public void testEditDistance_WithCaseChanges() {
        // Case sensitivity - the current implementation treats uppercase and lowercase
        // separately
        assertEquals(6, CaesarEditDistance.editDistance("ABC", "abc"));
    }

    @Test
    public void testEditDistance_ComplexExample() {
        // A more complex example
        assertEquals(6, CaesarEditDistance.editDistance("hello", "world"));
    }
} 