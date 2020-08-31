package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link StringSpacesReplacement}
 *
 * @author Milan Rathod
 */
class StringSpacesReplacementTest {

    @Test
    void testReplaceSpaces() {
        String input = "I am Sumit Jain";
        StringSpacesReplacement spacesReplacement = new StringSpacesReplacement();

        assertEquals("I%20am%20Sumit%20Jain", spacesReplacement.replaceSpaces(input));
    }
}