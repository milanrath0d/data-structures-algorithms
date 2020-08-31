package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link PalindromeDemo}
 *
 * @author Milan Rathod
 */
class PalindromeDemoTest {

    @Test
    void testPalindromeString() {
        PalindromeDemo palindromeDemo = new PalindromeDemo();
        boolean result = palindromeDemo.palindromeString("abc");

        assertFalse(result);
    }

    @Test
    void testPalindromeNumber() {
        PalindromeDemo palindromeDemo = new PalindromeDemo();
        boolean result = palindromeDemo.palindromeNumber(13431);

        assertTrue(result);
    }
}