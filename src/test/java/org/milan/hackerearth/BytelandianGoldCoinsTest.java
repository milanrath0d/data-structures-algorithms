package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class {@link BytelandianGoldCoins}
 *
 * @author Milan Rathod
 */
class BytelandianGoldCoinsTest {

    @Test
    void testReplaceCoins() {
        BytelandianGoldCoins bytelandianGoldCoins = new BytelandianGoldCoins();
        long result = bytelandianGoldCoins.replaceCoins(474788800);

        assertEquals(1901257550, result);
    }
}