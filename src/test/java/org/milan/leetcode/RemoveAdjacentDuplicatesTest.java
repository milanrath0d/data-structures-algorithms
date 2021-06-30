package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link org.milan.leetcode.RemoveAdjacentDuplicates}
 *
 * @author Milan Rathod
 */
class RemoveAdjacentDuplicatesTest {

    @Test
    void removeDuplicates() {
        RemoveAdjacentDuplicates removeAdjacentDuplicates = new RemoveAdjacentDuplicates();

        assertEquals("ca", removeAdjacentDuplicates.removeDuplicates("abbaca"));

        assertEquals("ay", removeAdjacentDuplicates.removeDuplicates("azxxzy"));

        assertEquals("", removeAdjacentDuplicates.removeDuplicates("aaaaaaaa"));

        assertEquals("a", removeAdjacentDuplicates.removeDuplicates("aaaaa"));

        assertEquals("ababa", removeAdjacentDuplicates.removeDuplicates("abbbabaaa"));
    }

}