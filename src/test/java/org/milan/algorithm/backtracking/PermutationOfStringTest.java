package org.milan.algorithm.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link PermutationOfString}
 *
 * @author Milan Rathod
 */
class PermutationOfStringTest {

    private PermutationOfString permutationOfString;

    @BeforeEach
    void setup() {
        permutationOfString = new PermutationOfString();
    }

    @Test
    void testPermutations_EmptyString() {
        List<String> result = permutationOfString.permutations("");
        
        // For empty string, result should be empty list
        assertTrue(result.isEmpty());
    }

    @Test
    void testPermutations_NullString() {
        List<String> result = permutationOfString.permutations(null);
        
        // For null string, result should be empty list
        assertTrue(result.isEmpty());
    }

    @Test
    void testPermutations_SingleCharacter() {
        List<String> result = permutationOfString.permutations("a");
        
        // For single character, only one permutation should exist
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    void testPermutations_TwoCharacters() {
        List<String> result = permutationOfString.permutations("ab");
        
        // For two characters, two permutations should exist: "ab" and "ba"
        assertEquals(2, result.size());
        
        Set<String> expectedPermutations = new HashSet<>(Arrays.asList("ab", "ba"));
        Set<String> actualPermutations = new HashSet<>(result);
        
        assertEquals(expectedPermutations, actualPermutations);
    }

    @Test
    void testPermutations_ThreeCharacters() {
        List<String> result = permutationOfString.permutations("abc");
        
        // For three characters, six permutations should exist
        assertEquals(6, result.size());
        
        Set<String> expectedPermutations = new HashSet<>(Arrays.asList(
            "abc", "acb", "bac", "bca", "cab", "cba"
        ));
        Set<String> actualPermutations = new HashSet<>(result);
        
        assertEquals(expectedPermutations, actualPermutations);
    }

    @Test
    void testPermutations_DuplicateCharacters() {
        List<String> result = permutationOfString.permutations("aba");
        
        // For string with duplicate characters, some permutations may be duplicated
        // There should be 3!/2! = 3 unique permutations
        
        Set<String> uniquePermutations = new HashSet<>(result);
        assertEquals(3, uniquePermutations.size());
        
        Set<String> expectedPermutations = new HashSet<>(Arrays.asList(
            "aba", "aab", "baa"
        ));
        
        assertEquals(expectedPermutations, uniquePermutations);
    }

    @Test
    void testPermutations_FourCharacters() {
        List<String> result = permutationOfString.permutations("wxyz");
        
        // For four characters, 24 permutations should exist (4!)
        assertEquals(24, result.size());
        
        // Verify all permutations are unique
        Set<String> uniquePermutations = new HashSet<>(result);
        assertEquals(24, uniquePermutations.size());
        
        // Check a few expected permutations
        assertTrue(uniquePermutations.contains("wxyz"));
        assertTrue(uniquePermutations.contains("wzxy"));
        assertTrue(uniquePermutations.contains("yzwx"));
    }
}
