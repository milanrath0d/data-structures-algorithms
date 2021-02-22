package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link GoriCrush}
 *
 * @author Milan Rathod
 */
class GoriCrushTest {

    @Test
    void testDetermineFortune_Swap() {
        GoriCrush goriCrush = new GoriCrush();

        long[] fortunes = new long[]{1, 2, 3, 4, 5};

        String result = goriCrush.determineFortune(fortunes, new long[]{0, 5, 6}, 3);

        assertEquals("", result);

        assertArrayEquals(new long[]{1, 2, 3, 4, 6}, fortunes);
    }

    @Test
    void testDetermineFortune_Success() {
        GoriCrush goriCrush = new GoriCrush();

        String result = goriCrush.determineFortune(new long[]{1, 2, 3, 4, 6}, new long[]{1, 1, 6, 3, 7}, 3);

        assertEquals("Propose", result);
    }

    @Test
    void testDetermineFortune_Failure() {
        GoriCrush goriCrush = new GoriCrush();

        String result = goriCrush.determineFortune(new long[]{1, 2, 3, 4, 5}, new long[]{1, 2, 3, 3, 7}, 3);

        assertEquals("Do not propose", result);
    }
}