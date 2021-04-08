package org.milan.careercup;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link OddNumbers}
 *
 * @author Milan Rathod
 */
class OddNumbersTest {

    @Test
    void testFindOddNumbers() {
        OddNumbers oddNumbers = new OddNumbers();
        int[] inputArray = {2, 3, 2, 3, 3, 4, 5, 4, 2, 2, 5, 6};

        List<Integer> result = oddNumbers.findOddNumbers(inputArray);

        List<Integer> actual = List.of(3, 6);

        assertEquals(result, actual);
    }
}