package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link AlphaPrimes}
 *
 * @author Milan Rathod
 */
class AlphaPrimesTest {

    @Test
    void testGetCount() {
        AlphaPrimes alphaPrimes = new AlphaPrimes();
        int count = alphaPrimes.getCount(110, 114);

        assertEquals(3, count);
    }
}