package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaximumLevelSum}
 *
 * @author Milan Rathod
 */
class MaximumLevelSumTest {

    @Test
    void testFindMaximumLevelSum() {
        BinarySearchTree<Integer> binarySearchTree = TreeDataUtil.initializeBST();

        MaximumLevelSum maximumLevelSum = new MaximumLevelSum();

        assertEquals(80, maximumLevelSum.find(binarySearchTree.getRoot()));
    }

}