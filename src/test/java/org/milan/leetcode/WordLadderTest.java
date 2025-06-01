package org.milan.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link WordLadder}
 * 
 * @author Milan Rathod
 */
class WordLadderTest {

    private WordLadder wordLadder;

    @BeforeEach
    void setUp() {
        wordLadder = new WordLadder();
    }

    @Test
    void testLadderLength_Example1() {
        // LeetCode Example 1
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        // Expected transformation sequence: "hit" -> "hot" -> "dot" -> "dog" -> "cog"
        // Length = 5
        assertEquals(5, result, "The ladder length should be 5");
    }
    
    @Test
    void testLadderLength_Example2() {
        // LeetCode Example 2
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        // No valid transformation sequence as "cog" is not in wordList
        assertEquals(0, result, "The ladder length should be 0 when endWord is not in wordList");
    }
    
    @Test
    void testLadderLength_GeeksForGeeksExample() {
        // GeeksForGeeks Example
        String beginWord = "toon";
        String endWord = "plea";
        List<String> wordList = Arrays.asList("poon", "plee", "same", "poie", "plie", "poin", "plea");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        // Expected transformation sequence: "toon" -> "poon" -> "poin" -> "poie" -> "plie" -> "plee" -> "plea"
        // Length = 7
        assertEquals(7, result, "The ladder length for GeeksForGeeks example should be 7");
    }
    
    @Test
    void testLadderLength_SingleCharDifference() {
        // Test case where begin and end words differ by a single character
        String beginWord = "dog";
        String endWord = "fog";
        List<String> wordList = Arrays.asList("fog", "log", "bog");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        // Expected transformation sequence: "dog" -> "fog"
        // Length = 2
        assertEquals(2, result, "The ladder length should be 2 for single character difference");
    }
    
    @Test
    void testLadderLength_BeginWordNotInList() {
        // Test case where begin word is not in the wordList (which is valid according to problem)
        String beginWord = "red";
        String endWord = "tax";
        List<String> wordList = Arrays.asList("ted", "tex", "tax");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        // Expected transformation sequence: "red" -> "ted" -> "tex" -> "tax"
        // Length = 4
        assertEquals(4, result, "The ladder length should be 4");
    }
    
    @Test
    void testLadderLength_NoValidPath() {
        // Test case where there is no valid transformation path
        String beginWord = "hit";
        String endWord = "zoo";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        assertEquals(0, result, "The ladder length should be 0 when no valid path exists");
    }
    
    @Test
    void testLadderLength_EmptyWordList() {
        // Test case with empty word list
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList();
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        assertEquals(0, result, "The ladder length should be 0 with empty wordList");
    }
    
    @Test
    void testLadderLength_SameBeginAndEndWord() {
        // Test case where begin and end words are the same
        String beginWord = "hit";
        String endWord = "hit";
        List<String> wordList = Arrays.asList("hot", "dot", "dog");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        assertEquals(1, result, "The ladder length should be 1 when begin and end words are the same");
    }
    
    @Test
    void testLadderLength_LongTransformationChain() {
        // Test case with a longer transformation chain
        String beginWord = "mate";
        String endWord = "mile";
        List<String> wordList = Arrays.asList("math", "path", "male", "mole", "mile", "late", "lake", "make");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        // One possible transformation: "mate" -> "male" -> "mile"
        // Length = 3
        assertEquals(3, result, "The ladder length should be 3 for this longer transformation");
    }
    
    @Test
    void testLadderLength_MultiplePathsWithSameLength() {
        // Test case where multiple paths with the same length exist
        String beginWord = "hot";
        String endWord = "dog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "hog");
        
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        
        // Two possible paths:
        // 1. "hot" -> "dot" -> "dog"
        // 2. "hot" -> "hog" -> "dog"
        // Both have length 3
        assertEquals(3, result, "The ladder length should be 3 for multiple paths with same length");
    }
    
    @Test
    void testLadderLengthV2_Example1() {
        // LeetCode Example 1
        String beginWord = "hit";
        String endWord = "cog";
        Set<String> wordList = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        // Expected transformation sequence: "hit" -> "hot" -> "dot" -> "dog" -> "cog"
        // Length = 5
        assertEquals(5, result, "The ladder length V2 should be 5");
    }
    
    @Test
    void testLadderLengthV2_Example2() {
        // LeetCode Example 2
        String beginWord = "hit";
        String endWord = "cog";
        Set<String> wordList = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        // No valid transformation sequence as "cog" is not in wordList
        assertEquals(0, result, "The ladder length V2 should be 0 when endWord is not in wordList");
    }
    
    @Test
    void testLadderLengthV2_GeeksForGeeksExample() {
        // GeeksForGeeks Example
        String beginWord = "toon";
        String endWord = "plea";
        Set<String> wordList = new HashSet<>(Arrays.asList("poon", "plee", "same", "poie", "plie", "poin", "plea"));
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        // Expected transformation sequence: "toon" -> "poon" -> "poin" -> "poie" -> "plie" -> "plee" -> "plea"
        // Length = 7
        assertEquals(7, result, "The ladder length V2 for GeeksForGeeks example should be 7");
    }
    
    @Test
    void testLadderLengthV2_SingleCharDifference() {
        // Test case where begin and end words differ by a single character
        String beginWord = "dog";
        String endWord = "fog";
        Set<String> wordList = new HashSet<>(Arrays.asList("fog", "log", "bog"));
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        // Expected transformation sequence: "dog" -> "fog"
        // Length = 2
        assertEquals(2, result, "The ladder length V2 should be 2 for single character difference");
    }
    
    @Test
    void testLadderLengthV2_BeginWordNotInList() {
        // Test case where begin word is not in the wordList (which is valid according to problem)
        String beginWord = "red";
        String endWord = "tax";
        Set<String> wordList = new HashSet<>(Arrays.asList("ted", "tex", "tax"));
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        // Expected transformation sequence: "red" -> "ted" -> "tex" -> "tax"
        // Length = 4
        assertEquals(4, result, "The ladder length V2 should be 4");
    }
    
    @Test
    void testLadderLengthV2_NoValidPath() {
        // Test case where there is no valid transformation path
        String beginWord = "hit";
        String endWord = "zoo";
        Set<String> wordList = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        assertEquals(0, result, "The ladder length V2 should be 0 when no valid path exists");
    }
    
    @Test
    void testLadderLengthV2_EmptyWordList() {
        // Test case with empty word list
        String beginWord = "hit";
        String endWord = "cog";
        Set<String> wordList = new HashSet<>();
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        assertEquals(0, result, "The ladder length V2 should be 0 with empty wordList");
    }
    
    @Test
    void testLadderLengthV2_SameBeginAndEndWord() {
        // Test case where begin and end words are the same
        String beginWord = "hit";
        String endWord = "hit";
        Set<String> wordList = new HashSet<>(Arrays.asList("hot", "dot", "dog"));
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        assertEquals(1, result, "The ladder length V2 should be 1 when begin and end words are the same");
    }
    
    @Test
    void testLadderLengthV2_BidirectionalBFSAdvantage() {
        // Test case that showcases the advantage of bidirectional BFS in V2
        // Create a deep graph where bidirectional search should be more efficient
        String beginWord = "aaaaa";
        String endWord = "zzzzz";
        
        // Create a word list that forces a long path with many branches
        Set<String> wordList = new HashSet<>();
        
        // Add end word
        wordList.add(endWord);
        
        // Add middle words for paths
        for (char c = 'a'; c <= 'z'; c++) {
            for (char d = 'a'; d <= 'z'; d++) {
                wordList.add("a" + c + "aaa");
                wordList.add("aa" + c + "aa");
                wordList.add("aaa" + c + "a");
                wordList.add("aaaa" + c);
                
                wordList.add("z" + c + "zzz");
                wordList.add("zz" + c + "zz");
                wordList.add("zzz" + c + "z");
                wordList.add("zzzz" + c);
                
                // Add some connecting words
                wordList.add("a" + c + d + "zz");
                wordList.add("aa" + c + d + "z");
                wordList.add("z" + c + d + "aa");
                wordList.add("zz" + c + d + "a");
            }
        }
        
        int result = wordLadder.ladderLengthV2(beginWord, endWord, wordList);
        
        // The exact expected result will depend on the specific graph, but it should find a path
        assertTrue(result > 0, "The ladder length V2 should find a path in this complex graph");
    }
    
    private void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}