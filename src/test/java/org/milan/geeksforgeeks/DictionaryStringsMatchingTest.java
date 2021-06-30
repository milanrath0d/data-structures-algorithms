package org.milan.geeksforgeeks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link DictionaryStringsMatching}
 *
 * @author Milan Rathod
 */
class DictionaryStringsMatchingTest {

    private DictionaryStringsMatching dictionaryStringsMatching;

    private List<String> dictionary;

    private List<String> words;

    @BeforeEach
    void init() {
        dictionary = List.of("find", "a", "geeks",
                "all", "for", "on",
                "geeks", "answers", "inter");

        words = List.of("find", "all", "answers", "on",
                "geeks", "for", "geeks");

        dictionaryStringsMatching = new DictionaryStringsMatching();
    }

    @Test
    void isMatched() {
        assertTrue(dictionaryStringsMatching.isMatched(dictionary, words));

        assertFalse(dictionaryStringsMatching.isMatched(dictionary, List.of("find", "a", "geek")));
    }

    @Test
    @Disabled
    void isMatchedV2() {
        assertTrue(dictionaryStringsMatching.isMatchedV2(dictionary, words));

        assertFalse(dictionaryStringsMatching.isMatchedV2(dictionary, List.of("find", "a", "geek")));
    }
}