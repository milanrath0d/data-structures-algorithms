package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link DictionaryPatternMatching}
 *
 * @author Milan Rathod
 */
class DictionaryPatternMatchingTest {

    @Test
    void findMatchedWords() {
        DictionaryPatternMatching dictionaryPatternMatching = new DictionaryPatternMatching();

        List<String> result = dictionaryPatternMatching.findMatchedWords(List.of("abb", "abc",
            "xyz", "xyy"), "foo");

        assertTrue(ListUtil.isEqual(Arrays.asList("abb", "xyy"), result));
    }

    @Test
    void findMatchedWordsV2() {
        DictionaryPatternMatching dictionaryPatternMatching = new DictionaryPatternMatching();

        List<String> result = dictionaryPatternMatching.findMatchedWordsV2(List.of("abb", "abc",
            "xyz", "xyy"), "foo");

        assertTrue(ListUtil.isEqual(Arrays.asList("abb", "xyy"), result));
    }
}