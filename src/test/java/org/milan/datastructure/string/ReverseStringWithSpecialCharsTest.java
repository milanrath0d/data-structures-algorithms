package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ReverseStringWithSpecialChars}
 *
 * @author Milan Rathod
 */
class ReverseStringWithSpecialCharsTest {

    @Test
    void reverse() {
        ReverseStringWithSpecialChars reverseStringWithSpecialChars =
                new ReverseStringWithSpecialChars();

        String result = reverseStringWithSpecialChars.reverse("a,b$c");

        assertEquals("c,b$a", result);

        result = reverseStringWithSpecialChars.reverse("Ab,c,de!$");

        assertEquals("ed,c,bA!$", result);
    }
}