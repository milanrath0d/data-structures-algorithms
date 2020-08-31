package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SmallestPositiveMissingNumber}
 *
 * @author Milan Rathod
 */
class SmallestPositiveMissingNumberTest {

    private SmallestPositiveMissingNumber smallestPositiveMissingNumber;

    private int[] arr;

    @BeforeEach
    void setUp() {
        arr = new int[]{0, -1, -5, -10, 1, 2, 3, 4, 5};

        smallestPositiveMissingNumber = new SmallestPositiveMissingNumber();
    }

    @Test
    void testFind() {
        int result = smallestPositiveMissingNumber.find(arr);

        assertEquals(6, result);
    }

    @Test
    void testFindV2() {
        int result = smallestPositiveMissingNumber.findV2(arr);

        assertEquals(6, result);
    }
}