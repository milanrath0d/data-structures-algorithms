package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link ExpandStringRange}
 *
 * @author Milan Rathod
 */
class ExpandStringRangeTest {

    @Test
    void testExpand() {
        ExpandStringRange expandStringRange = new ExpandStringRange();

        String result = expandStringRange.expand("1-5, 8, 11-14, 18, 20, 26-29");

        assertEquals("1, 2, 3, 4, 5, 8, 11, 12, 13, 14, 18, 20, 26, 27, 28, 29", result);
    }
}