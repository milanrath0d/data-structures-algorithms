package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link TheGreatKian}
 *
 * @author Milan Rathod
 */
class TheGreatKianTest {

    @Test
    void testGetSumValues() {
        TheGreatKian theGreatKian = new TheGreatKian();
        List<Long> result = theGreatKian.getSumValues(new int[]{1, 2, 3, 4, 5});

        assertEquals(5, result.get(0).longValue());
        assertEquals(7, result.get(1).longValue());
        assertEquals(3, result.get(2).longValue());
    }
}