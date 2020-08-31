package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

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

        BigInteger result = biggestNumber.find(new int[]{1, 34, 3, 98, 9, 76, 45, 4, 12, 121});

        assertEquals(new BigInteger("99876454343121211"), result);
    }
}