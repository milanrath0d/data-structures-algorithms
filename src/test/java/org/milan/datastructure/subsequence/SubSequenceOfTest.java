package org.milan.datastructure.subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link SubSequenceOf}
 *
 * @author Milan Rathod
 */
class SubSequenceOfTest {

    @Test
    void testIsSubSequence() {
        SubSequenceOf subSequenceOf = new SubSequenceOf();
        assertTrue(subSequenceOf.isSubSequence("AXY", "ADXCPY", 3, 6));

        assertFalse(subSequenceOf.isSubSequence("AXY", "YADXCP", 3, 6));
    }
}