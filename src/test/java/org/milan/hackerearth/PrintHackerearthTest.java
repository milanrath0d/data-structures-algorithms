package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link PrintHackerearth}
 *
 * @author Milan Rathod
 */
class PrintHackerearthTest {

    @Test
    void testPrintHackerearth() {
        String input = "aahkcreeatrha";
        PrintHackerearth printHackerearth = new PrintHackerearth();
        int result = printHackerearth.printHackerearth(input);

        assertEquals(1, result);
    }
}