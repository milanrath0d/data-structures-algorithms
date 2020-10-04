package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BiggestNumber}
 *
 * @author Milan Rathod
 */
class BiggestNumberTest {

    @Test
    void testFind() {
        BiggestNumber biggestNumber = new BiggestNumber();

        String result = biggestNumber.find(new int[]{1, 34, 3, 98, 9, 76, 45, 4, 12, 121});

        assertEquals("99876454343121211", result);
    }

    @Test
    void testFindV2() {
        BiggestNumber biggestNumber = new BiggestNumber();

        String result = biggestNumber.findV2(new int[]{1, 34, 3, 98, 9, 76, 45, 4, 12, 121});

        assertEquals("99876454343121211", result);
    }
}