package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link TwoRepeatingNumbers}
 *
 * @author Milan Rathod
 */
class TwoRepeatingNumbersTest {

    private TwoRepeatingNumbers twoRepeatingNumbers;

    private int[] inputArray;

    @BeforeEach
    void setUp() {
        twoRepeatingNumbers = new TwoRepeatingNumbers();

        inputArray = new int[]{4, 2, 4, 5, 2, 3, 1};
    }

    @Test
    void findUsingCountArray() {
        int[] result = twoRepeatingNumbers.findUsingCountArray(inputArray);

        assertArrayEquals(new int[]{4, 2}, result);
    }

    @Test
    void findUsingEquation() {
        int[] result = twoRepeatingNumbers.findUsingEquation(inputArray);

        assertArrayEquals(new int[]{4, 2}, result);
    }

    @Test
    void findUsingAbs() {
        int[] result = twoRepeatingNumbers.findUsingAbs(inputArray);

        assertArrayEquals(new int[]{2, 4}, result);
    }
}