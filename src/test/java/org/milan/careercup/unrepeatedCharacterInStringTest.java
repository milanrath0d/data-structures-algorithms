package org.milan.careercup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link UnrepeatedCharacterInString}
 *
 * @author Milan Rathod
 */
class unrepeatedCharacterInStringTest {

    @Test
    void testLongestSubstringUnrepeatedChar() {
        UnrepeatedCharacterInString unrepeatedCharacterInString = new UnrepeatedCharacterInString();
        String result = unrepeatedCharacterInString.longestSubstringUnrepeatedChar("abcabaabccfdsaewer");

        assertEquals("cfdsaew", result);
    }
}