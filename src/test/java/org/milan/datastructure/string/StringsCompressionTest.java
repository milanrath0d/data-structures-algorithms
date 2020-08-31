package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link StringsCompression}
 *
 * @author Milan Rathod
 */
class StringsCompressionTest {

    @Test
    void testCompression() {
        StringsCompression stringsCompression = new StringsCompression();

        String input = "ssssuuuummmmmmiiiittttttttttttt";

        assertEquals("s4u4m6i4t13", stringsCompression.compression(input));

        input = "Jaain";

        assertEquals("Jaain", stringsCompression.compression(input));
    }
}