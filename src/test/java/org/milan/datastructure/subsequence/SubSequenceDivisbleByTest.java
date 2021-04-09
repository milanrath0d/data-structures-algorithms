package org.milan.datastructure.subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SubSequenceDivisbleBy}
 *
 * @author Milan Rathod
 */
class SubSequenceDivisbleByTest {

    @Test
    void testCount() {
        int result = new SubSequenceDivisbleBy().count("330", 6);
        assertEquals(4, result);
    }
}