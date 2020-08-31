package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link GoriCrush}
 *
 * @author Milan Rathod
 */
class GoriCrushTest {

    @Test
    void testDetermineFortune() {
        GoriCrush goriCrush = new GoriCrush();

        String result = goriCrush.determineFortune(new long[]{1, 2, 3, 4, 6}, new long[]{1, 1, 6, 3, 7}, 3);

        assertEquals("Propose", result);
    }
}