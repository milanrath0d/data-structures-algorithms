package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link FirstRepeatingLeftmostCharacter}
 *
 * @author Milan Rathod
 */
class FirstRepeatingLeftmostCharacterTest {

    @Test
    void testFind() {
        FirstRepeatingLeftmostCharacter firstRepeatingLeftmostCharacter = new FirstRepeatingLeftmostCharacter();

        char result = firstRepeatingLeftmostCharacter.find("geeksforgeeks");

        assertEquals('g', result);
    }
}