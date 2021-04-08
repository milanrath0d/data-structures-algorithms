package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TheGreatKian}
 *
 * @author Milan Rathod
 */
class TheGreatKianTest {

    @Test
    void testGetSumValues() {
        TheGreatKian theGreatKian = new TheGreatKian();
        List<Long> result = theGreatKian.getSumValues(new int[]{1, 2, 3, 4, 5});

        assertEquals(List.of(5L, 7L, 3L), result);
    }
}