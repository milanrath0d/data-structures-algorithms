package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link AddNumber}
 *
 * @author Milan Rathod
 */
class AddNumberTest {

    @Test
    void testAdd() {
        AddNumber addNumber = new AddNumber();
        int result = addNumber.add(11);

        assertEquals(12, result);
    }
}