package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MissingNumber}
 *
 * @author Milan Rathod
 */
class MissingNumberTest {

    private MissingNumber missingNumber;

    private int[] inputArray;

    @BeforeEach
    void setup() {
        missingNumber = new MissingNumber();

        inputArray = new int[]{1, 2, 4, 5, 6};
    }

    @Test
    void testFindUsingSum() {
        int result = missingNumber.findUsingSum(inputArray);

        assertEquals(3, result);
    }

    @Test
    void testFindUsingSubtract() {
        int result = missingNumber.findUsingSubtract(inputArray);

        assertEquals(3, result);
    }

    @Test
    void testFindUsingXOR() {
        int result = missingNumber.findUsingXOR(inputArray);

        assertEquals(3, result);
    }
}