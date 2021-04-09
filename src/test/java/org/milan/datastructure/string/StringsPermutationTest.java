package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Test class for {@link StringsPermutation}
 *
 * @author Milan Rathod
 */
class StringsPermutationTest {

    @Test
    void testPermutation() {
        StringsPermutation stringsPermutation = new StringsPermutation();

        String s1 = "abc";
        String s2 = "ccb";

        assertFalse(stringsPermutation.isPermuted(s1, s2));
    }
}