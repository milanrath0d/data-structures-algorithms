package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link CoinChangeProblem}
 *
 * @author Milan Rathod
 */
class CoinChangeProblemTest {

    private CoinChangeProblem coinChangeProblem;

    @BeforeEach
    void setUp() {
        coinChangeProblem = new CoinChangeProblem();
    }

    @Test
    void testCount() {
        int[] coins = new int[]{1, 2, 3};

        int n = 4;

        int result = coinChangeProblem.count(coins, coins.length, n);

        assertEquals(4, result);
    }

    @Test
    void testCountV2() {
        int[] coins = new int[]{1, 2, 3};

        int n = 4;

        int result = coinChangeProblem.countV2(coins, n);

        assertEquals(4, result);
    }
}