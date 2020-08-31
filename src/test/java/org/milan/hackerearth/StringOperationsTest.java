package org.milan.hackerearth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class {@link StringOperations}
 *
 * @author Milan Rathod
 */
class StringOperationsTest {

    private StringOperations stringOperations;

    private StringBuilder inputString;

    @BeforeEach
    void setup() {
        inputString = new StringBuilder("helloworld");
        stringOperations = new StringOperations();
    }

    @Test
    void testVerifyOperation() {
        stringOperations.replaceOperation(inputString, 0, 'a');
        stringOperations.replaceOperation(inputString, 7, 'x');
        assertEquals("aellowoxld", inputString.toString());

        char[] result1 = inputString.toString().toCharArray();

        stringOperations.reverseOperation(inputString, 1, 2);
        stringOperations.reverseOperation(inputString, 1, 3);
        assertEquals("alelowoxld", inputString.toString());

        char[] result2 = inputString.toString().toCharArray();

        int count = 0;
        for (int i = 0; i < result1.length; i++) {
            if (result1[i] == result2[i]) {
                count++;
            }
        }

        assertEquals(8, count);
    }
}