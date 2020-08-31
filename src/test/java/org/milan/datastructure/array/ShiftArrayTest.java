package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link ShiftArray}
 *
 * @author Milan Rathod
 */
class ShiftArrayTest {

    @Test
    void testComputeFinalArray() {
        int[] inputArray = {12, 1, 13, 24, 12, 66, 12};
        int[] expectedResult = {1, 1, 1, 1, 13, 24, 66};

        ShiftArray shiftArray = new ShiftArray();
        int[] result = shiftArray.computeFinalArray(inputArray, 12);

        assertTrue(Arrays.equals(result, expectedResult));
    }
}