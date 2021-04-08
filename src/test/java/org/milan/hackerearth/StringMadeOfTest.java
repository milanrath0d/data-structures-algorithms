package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class {@link StringMadeOf}
 *
 * @author Milan Rathod
 */
class StringMadeOfTest {

    @Test
    void testCountDashes() {
        StringMadeOf stringMadeOf = new StringMadeOf();
        int result = stringMadeOf.countDashes("12134");

        assertEquals(18, result);
    }
}