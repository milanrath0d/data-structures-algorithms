package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PrintHackerEarth}
 *
 * @author Milan Rathod
 */
class PrintHackerEarthTest {

    @Test
    void testPrint() {
        PrintHackerEarth printHackerearth = new PrintHackerEarth();
        int result = printHackerearth.print("aahkcreeatrha");

        assertEquals(1, result);
    }
}