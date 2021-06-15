package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link InvalidTransactions}
 *
 * @author Milan Rathod
 */
class InvalidTransactionsTest {

    @Test
    void invalidTransactions() {
        InvalidTransactions invalidTransactions = new InvalidTransactions();

        List<String> result = invalidTransactions.findAll(new String[]{"alice,20,800,mtv", "alice,50,100,beijing"});

        assertEquals(result, List.of("alice,20,800,mtv", "alice,50,100,beijing"));

        result = invalidTransactions.findAll(new String[]{"alice,20,800,mtv", "alice,50,1200,mtv"});

        assertEquals(result, List.of("alice,50,1200,mtv"));

        result = invalidTransactions.findAll(new String[]{"alice,20,800,mtv", "bob,50,1200,mtv"});

        assertEquals(result, List.of("bob,50,1200,mtv"));
    }
}