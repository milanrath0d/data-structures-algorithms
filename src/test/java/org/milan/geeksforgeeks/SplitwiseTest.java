package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link Splitwise}
 *
 * @author Milan Rathod
 */
class SplitwiseTest {

    @Test
    void testSimplifyDebt() {
        // Input Graph describing debts of persons to each other
        int[][] input = {{0, 1000, 2000},
            {0, 0, 5000},
            {0, 0, 0}};

        Splitwise splitwise = new Splitwise();

        splitwise.simplifyDebt(input, 3);
    }
}