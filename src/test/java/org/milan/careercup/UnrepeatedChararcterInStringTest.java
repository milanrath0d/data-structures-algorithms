package org.milan.careercup;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Class for {@link UnrepeatedCharacterInString}
 *
 * @author Milan Rathod
 */
public class UnrepeatedChararcterInStringTest {

    @Test
    public void testLongestSubstringUnrepeatedChar() {
        UnrepeatedCharacterInString unrepeatedChararcterInString = new UnrepeatedCharacterInString();
        String result = unrepeatedChararcterInString.longestSubstringUnrepeatedChar("abcabaabccfdsaewer");

        Assert.assertTrue(result.equals("cfdsaew"));
    }
}