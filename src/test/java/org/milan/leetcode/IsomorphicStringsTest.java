package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link IsomorphicStrings}
 *
 * @author Milan Rathod
 */
class IsomorphicStringsTest {

    @Test
    void isIsomorphic() {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));

        assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));

        assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));

        assertFalse(isomorphicStrings.isIsomorphic("badc", "baba"));
    }
}