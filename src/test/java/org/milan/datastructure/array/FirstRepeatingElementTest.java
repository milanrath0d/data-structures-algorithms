package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link FirstRepeatingElement}
 *
 * @author Milan Rathod
 */
class FirstRepeatingElementTest {

    private FirstRepeatingElement firstRepeatingElement;

    @BeforeEach
    void setUp() {
        firstRepeatingElement = new FirstRepeatingElement();
    }

    @Test
    void testFind_RepeatingElementExists() {
        int[] inputArray = new int[]{10, 5, 3, 4, 3, 5, 6};

        int result = firstRepeatingElement.find(inputArray);

        assertEquals(5, result);
    }

    @Test
    void testFind_RepeatingElementNotExists() {
        int[] inputArray = new int[]{10, 5, 1, 4, 3, 2, 6};

        int result = firstRepeatingElement.find(inputArray);

        assertEquals(-1, result);
    }
}