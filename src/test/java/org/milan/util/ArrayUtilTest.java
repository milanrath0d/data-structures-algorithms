package org.milan.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link ArrayUtil}
 *
 * @author Milan Rathod
 */
class ArrayUtilTest {

    @Test
    void swap() {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        ArrayUtil.swap(arr, 1, 3);

        assertArrayEquals(new int[]{1, 4, 3, 2, 5}, arr);
    }

    @Test
    void reverseSort() {
        int[] arr = new int[]{1, 3, 5, 2, 4};

        ArrayUtil.reverseSort(arr);

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arr);
    }
}