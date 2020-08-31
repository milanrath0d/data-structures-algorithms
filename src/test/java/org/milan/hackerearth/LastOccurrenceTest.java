package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LastOccurrence}
 *
 * @author Milan Rathod
 */
class LastOccurrenceTest {

    @Test
    void testGet() {
        LastOccurrence lastOccurrence = new LastOccurrence();

        int result = lastOccurrence.get(new int[]{1, 2, 3, 4, 1}, 1);

        assertEquals(5, result);
    }
}