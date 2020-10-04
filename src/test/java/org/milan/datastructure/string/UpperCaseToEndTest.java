package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link UpperCaseToEnd}
 *
 * @author Milan Rathod
 */
class UpperCaseToEndTest {

    @Test
    void testMove() {
        UpperCaseToEnd upperCaseToEnd = new UpperCaseToEnd();

        String result = upperCaseToEnd.move("Geeksforgeeks A Computer Science Portal for Geeks!!");

        assertEquals("eeksforgeeks  omputer cience ortal for eeks!!GACSPG", result);
    }
}