package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link DigitsAndProduct}
 *
 * @author Milan Rathod
 */
class DigitsAndProductTest {

    @Test
    void testCount() {
        DigitsAndProduct digitsAndProduct = new DigitsAndProduct();

        int result = digitsAndProduct.count(10, 12, 2);

        assertEquals(1, result);

        result = digitsAndProduct.count(5, 15, 2);

        assertEquals(9, result);
    }
}