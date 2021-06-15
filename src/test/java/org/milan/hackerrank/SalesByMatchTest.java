package org.milan.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SalesByMatch}
 *
 * @author Milan Rathod
 */
class SalesByMatchTest {

    @Test
    void sockMerchant() {
        SalesByMatch salesByMatch = new SalesByMatch();

        int result = salesByMatch.sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20));

        assertEquals(3, result);
    }
}