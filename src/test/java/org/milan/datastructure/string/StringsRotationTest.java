package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link StringsRotation}
 *
 * @author Milan Rathod
 */
class StringsRotationTest {

    @Test
    void testIsRotated() {
        StringsRotation stringsRotation = new StringsRotation();

        String s1 = "sumitjain";
        String s2 = "tjainsumi";

        assertTrue(stringsRotation.isRotated(s1, s2));
    }
}