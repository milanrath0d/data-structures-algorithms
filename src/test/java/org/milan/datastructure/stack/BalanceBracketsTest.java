package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link BalanceBrackets}
 *
 * @author Milan Rathod
 */
class BalanceBracketsTest {

    @Test
    void testCheckBalance() {
        BalanceBrackets balanceBrackets = new BalanceBrackets();
        boolean result = balanceBrackets.checkBalance("(())");

        assertTrue(result);
    }
}