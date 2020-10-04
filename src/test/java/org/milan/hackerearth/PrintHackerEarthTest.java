package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link PrintHackerEarth}
 *
 * @author Milan Rathod
 */
class PrintHackerEarthTest {

    @Test
    void testPrint() {
        String input = "aahkcreeatrha";
        PrintHackerEarth printHackerearth = new PrintHackerEarth();
        int result = printHackerearth.print(input);

        assertEquals(1, result);
    }
}