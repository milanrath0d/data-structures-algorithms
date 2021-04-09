package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link RemoveDuplicatesInSortedArray}
 *
 * @author Milan Rathod
 */
class RemoveDuplicatesInSortedArrayTest {

    @Test
    void testRemoveDuplicates() {
        RemoveDuplicatesInSortedArray removeDuplicatesInSortedArray = new RemoveDuplicatesInSortedArray();

        int[] uniqueArr = removeDuplicatesInSortedArray.removeDuplicates(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4});

        assertArrayEquals(new int[]{1, 2, 3, 4}, uniqueArr);
    }

}