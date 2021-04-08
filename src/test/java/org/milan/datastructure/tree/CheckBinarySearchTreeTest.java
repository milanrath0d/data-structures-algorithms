package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link CheckBinarySearchTree}
 *
 * @author Milan Rathod
 */
class CheckBinarySearchTreeTest {

    private BinarySearchTree<Integer> binarySearchTree;

    private BinaryTree<Integer> binaryTree;

    private CheckBinarySearchTree checkBinarySearchTree;

    @BeforeEach
    void setup() {
        checkBinarySearchTree = new CheckBinarySearchTree();

        binaryTree = TreeDataUtil.initialize();

        binarySearchTree = TreeDataUtil.initializeBST();
    }

    @Test
    void testIsBST_Success() {
        assertTrue(checkBinarySearchTree.isBST(binarySearchTree.getRoot()));
    }

    @Test
    void testIsBST_Failure() {
        assertFalse(checkBinarySearchTree.isBST(binaryTree.getRoot()));
    }

    @Test
    void testIsBSTUsingInOrder_Success() {
        assertTrue(checkBinarySearchTree.isBSTUsingInOrder(binarySearchTree.getRoot()));
    }

    @Test
    void testIsBSTUsingInOrder_Failure() {
        assertFalse(checkBinarySearchTree.isBSTUsingInOrder(binaryTree.getRoot()));
    }

}