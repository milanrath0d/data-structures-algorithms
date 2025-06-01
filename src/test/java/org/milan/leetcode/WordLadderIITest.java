package org.milan.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link WordLadderII}
 *
 * @author Milan Rathod
 */
class WordLadderIITest {

    private WordLadderII wordLadderII;

    @BeforeEach
    void setUp() {
        wordLadderII = new WordLadderII();
    }

    @Test
    void testFindLadders_Example1() {
        // LeetCode Example 1
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));

        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);

        // Expected to find 2 transformation sequences
        assertEquals(2, result.size());

        // Expected paths:
        // 1. "hit" -> "hot" -> "dot" -> "dog" -> "cog"
        // 2. "hit" -> "hot" -> "lot" -> "log" -> "cog"
        assertTrue(containsPath(result, Arrays.asList("hit", "hot", "dot", "dog", "cog")));
        assertTrue(containsPath(result, Arrays.asList("hit", "hot", "lot", "log", "cog")));
    }

    @Test
    void testFindLadders_Example2() {
        // LeetCode Example 2
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));

        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);

        // Expected no valid transformation sequence
        assertEquals(0, result.size());
    }

    @Test
    void testFindLadders_SingleCharDifference() {
        // Test case where begin and end words differ by a single character
        String beginWord = "a";
        String endWord = "c";
        List<String> wordList = new ArrayList<>(Arrays.asList("a", "b", "c"));

        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);

        // Should find one path: "a" -> "c"
        assertEquals(1, result.size());
        assertTrue(containsPath(result, Arrays.asList("a", "c")));
    }

    @Test
    void testFindLadders_MultiplePaths() {
        // Test case with multiple possible paths
        String beginWord = "red";
        String endWord = "tax";
        List<String> wordList = new ArrayList<>(Arrays.asList("ted", "tex", "red", "tax", "tad", "rex", "rad"));

        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);

        // Should find multiple paths with the same shortest length
        assertTrue(result.size() >= 2);

        // All paths should have the same length (shortest)
        int pathLength = result.get(0).size();
        for (List<String> path : result) {
            assertEquals(pathLength, path.size(), "All paths should have the same length");
        }

        // Some expected paths:
        // "red" -> "ted" -> "tex" -> "tax"
        // "red" -> "rad" -> "tad" -> "tax"
        // "red" -> "rex" -> "tex" -> "tax"
        int validPathsFound = 0;
        if (containsPath(result, Arrays.asList("red", "ted", "tex", "tax"))) validPathsFound++;
        if (containsPath(result, Arrays.asList("red", "rad", "tad", "tax"))) validPathsFound++;
        if (containsPath(result, Arrays.asList("red", "rex", "tex", "tax"))) validPathsFound++;

        assertTrue(validPathsFound > 0, "At least one expected path should be found");
    }

    @Test
    void testFindLadders_SameBeginAndEnd() {
        // Test case where begin and end words are the same
        String beginWord = "hit";
        String endWord = "hit";
        List<String> wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog"));

        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);

        // Should find one path: "hit"
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("hit", result.get(0).get(0));
    }

    @Test
    void testFindLadders_NoValidPath() {
        // Test case where there's no valid path
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(Arrays.asList("hot", "hat", "cag"));

        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);

        // No valid transformation sequences
        assertEquals(0, result.size());
    }

    @Test
    void testFindLadders_EmptyWordList() {
        // Test case with empty word list
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();

        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);

        // No valid transformation sequences
        assertEquals(0, result.size());
    }

    @Test
    void testFindLadders_LongWords() {
        // Test case with longer words
        String beginWord = "teach";
        String endWord = "place";
        List<String> wordList = new ArrayList<>(Arrays.asList("peach", "beach", "reach", "peace", "place", "teach"));

        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);

        // Expected paths like: "teach" -> "reach" -> "peace" -> "place"
        assertTrue(result.size() > 0);

        // Check if at least one valid path exists
        boolean foundValidPath = false;
        for (List<String> path : result) {
            if (path.get(0).equals(beginWord) && path.get(path.size() - 1).equals(endWord)) {
                foundValidPath = true;
                break;
            }
        }
        assertTrue(foundValidPath, "Should find at least one valid path");
    }

    /**
     * Helper method to check if a specific path exists in the result
     */
    private boolean containsPath(List<List<String>> allPaths, List<String> targetPath) {
        for (List<String> path : allPaths) {
            if (ListUtil.isEqual(path, targetPath)) {
                return true;
            }
        }
        return false;
    }
}