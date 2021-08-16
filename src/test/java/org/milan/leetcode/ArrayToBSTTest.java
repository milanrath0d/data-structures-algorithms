package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link ArrayToBST}
 *
 * @author Milan Rathod
 */
class ArrayToBSTTest {

    @Test
    void sortedArrayToBST() {
        int[] arr = new int[]{-10, -3, 0, 5, 9};

        ArrayToBST arrayToBST = new ArrayToBST();

        TreeNode root = arrayToBST.sortedArrayToBST(arr);

        assertEquals(0, root.val);
    }
}