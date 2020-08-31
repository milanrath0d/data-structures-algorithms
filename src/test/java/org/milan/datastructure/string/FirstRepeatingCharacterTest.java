package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link FirstRepeatingCharacter}
 *
 * @author Milan Rathod
 */
class FirstRepeatingCharacterTest {

    @Test
    void testFind() {
        FirstRepeatingCharacter firstRepeatingCharacter = new FirstRepeatingCharacter();

        char result = firstRepeatingCharacter.find("geeksforgeeks");

        assertEquals('e', result);
    }
}