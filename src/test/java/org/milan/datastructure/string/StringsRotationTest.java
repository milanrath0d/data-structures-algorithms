package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link StringsRotation}
 *
 * @author Milan Rathod
 */
class StringsRotationTest {

    @Test
    void testIsRotated_Success() {
        StringsRotation stringsRotation = new StringsRotation();

        String s1 = "sumitjain";
        String s2 = "tjainsumi";

        assertTrue(stringsRotation.isRotated(s1, s2));
    }

    @Test
    void testIsRotated_Failure() {
        StringsRotation stringsRotation = new StringsRotation();

        String s1 = "sumitjain";
        String s2 = "tjainnumi";

        assertFalse(stringsRotation.isRotated(s1, s2));
    }

    @Test
    void testIsRotatedV2_Success() {
        StringsRotation stringsRotation = new StringsRotation();

        String s1 = "sumitjain";
        String s2 = "tjainsumi";

        assertTrue(stringsRotation.isRotatedV2(s1, s2));
    }

    @Test
    void testIsRotatedV2_Failure() {
        StringsRotation stringsRotation = new StringsRotation();

        String s1 = "sumitjain";
        String s2 = "tjainnumi";

        assertFalse(stringsRotation.isRotatedV2(s1, s2));
    }
}