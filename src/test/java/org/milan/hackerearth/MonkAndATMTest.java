package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link MonkAndATM}
 *
 * @author Milan Rathod
 */
class MonkAndATMTest {

    @Test
    void testCheckPin() {
        MonkAndATM monkAndATM = new MonkAndATM();

        int result = monkAndATM.checkPin(48);

        assertEquals(8, result);
    }
}