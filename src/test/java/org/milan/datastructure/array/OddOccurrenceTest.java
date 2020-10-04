package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link OddOccurrence}
 *
 * @author Milan Rathod
 */
class OddOccurrenceTest {

    private OddOccurrence oddOccurrence;

    private int[] inputArray;

    @BeforeEach
    void setUp() {
        oddOccurrence = new OddOccurrence();

        inputArray = new int[]{1, 2, 3, 2, 3, 1, 3};
    }

    @Test
    void testFindUsingHashing() {
        int result = oddOccurrence.findUsingHashing(inputArray);

        assertEquals(3, result);
    }

    @Test
    void testFindUsingXOR() {
        int result = oddOccurrence.findUsingXOR(inputArray);

        assertEquals(3, result);
    }
}