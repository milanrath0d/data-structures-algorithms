package org.milan.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@linkplain LargestWordDictionary}
 *
 * @author Milan Rathod
 */
class LargestWordDictionaryTest {

    private LargestWordDictionary largestWordDictionary;

    @BeforeEach
    void setup() {
        largestWordDictionary = new LargestWordDictionary();
    }

    @Test
    void findLargestWord() {
        String largestWord = largestWordDictionary.findLargestWord(List.of(
                "ale", "apple", "monkey", "plea"
        ), "abpcplea");

        assertEquals("apple", largestWord);

        largestWord = largestWordDictionary.findLargestWord(List.of(
                "pintu", "geeksfor", "geeksgeeks",
                " forgeek"
        ), "geeksforgeeks");

        assertEquals("geeksgeeks", largestWord);
    }

    @Test
    void findLargestWord_MultipleMatches() {
        String largestWord = largestWordDictionary.findLargestWord(List.of(
                "abe", "abc"
        ), "abce");

        assertEquals("abc", largestWord);
    }

}