package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link StartsWithPrefixes }
 *
 * @author Milan Rathod
 */
class StartsWithPrefixesTest {

    @Test
    void testUsingRegularExpression() {
        StartsWithPrefixes startsWithPrefixes = new StartsWithPrefixes();
        boolean result = startsWithPrefixes.usingRegularExpression("GeeksforGeeks", new String[]{"Geeks", "for", "Gfor"});
        assertTrue(result);
    }

    @Test
    void testUsingStreams() {
        StartsWithPrefixes startsWithPrefixes = new StartsWithPrefixes();
        boolean result = startsWithPrefixes.usingStreams("GeeksforGeeks", new String[]{"Geeks", "for", "Gfor"});
        assertTrue(result);
    }
}