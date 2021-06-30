package org.milan.misc;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SpecialDivision}
 *
 * @author Milan Rathod
 */
class SpecialDivisionTest {

    @Test
    @Disabled
    void find() {
        SpecialDivision specialDivision = new SpecialDivision();

        assertEquals("2.(3)", specialDivision.find(7, 3));

        assertEquals("0.2(31)", specialDivision.find(229, 990));

        assertEquals("2", specialDivision.find(6, 3));
    }
}