package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link NextGreaterElement}
 *
 * @author Milan Rathod
 */
class NextGreaterElementTest {

    @Test
    void testFind() {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();

        int result = nextGreaterElement.find(534976);

        assertEquals(536479, result);

        result = nextGreaterElement.find(4321);

        assertEquals(4321, result);
    }
}