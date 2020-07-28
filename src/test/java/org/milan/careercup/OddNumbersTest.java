package org.milan.careercup;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Test Class for {@link OddNumbers}
 *
 * @author Milan Rathod
 */
public class OddNumbersTest {

    @Test
    public void testFindOddNumbers() {
        OddNumbers oddNumbers = new OddNumbers();
        int[] inputArray = {2, 3, 2, 3, 3, 4, 5, 4, 2, 2, 5, 6};

        List<Integer> result = oddNumbers.findOddNumbers(inputArray);

        List<Integer> actual = List.of(3, 6);

        Assert.assertEquals(result, actual);
    }
}