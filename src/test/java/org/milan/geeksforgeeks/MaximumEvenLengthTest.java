package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link MaximumEvenLength}
 *
 * @author Milan Rathod
 */
class MaximumEvenLengthTest {

    @Test
    void testFind() {
        MaximumEvenLength maximumEvenLength = new MaximumEvenLength();

        String result = maximumEvenLength.find("this is a test string");

        assertEquals("string", result);

        result = maximumEvenLength.find("geeksforgeeks is a platform for geeks");

        assertEquals("platform", result);
    }
}