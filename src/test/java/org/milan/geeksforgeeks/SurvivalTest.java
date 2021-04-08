package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Survival}
 *
 * @author Milan Rathod
 */
class SurvivalTest {

    @Test
    void testBuyFoodDays() {
        Survival survival = new Survival();
        int result = survival.buyFoodDays(16, 10, 2);

        assertEquals(2, result);
    }
}