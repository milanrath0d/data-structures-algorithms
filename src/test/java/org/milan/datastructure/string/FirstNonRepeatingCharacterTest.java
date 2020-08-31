package org.milan.datastructure.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link FirstNonRepeatingCharacter}
 *
 * @author Milan Rathod
 */
class FirstNonRepeatingCharacterTest {

    private FirstNonRepeatingCharacter firstNonRepeatingCharacter;

    @BeforeEach
    void setUp() {
        firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
    }

    @Test
    void testFind() {
        int result = firstNonRepeatingCharacter.find("geeksforgeeks");

        assertEquals(5, result);
    }
}