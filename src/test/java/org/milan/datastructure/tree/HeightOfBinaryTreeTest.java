package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link HeightOfBinaryTree}
 *
 * @author Milan Rathod
 */
class HeightOfBinaryTreeTest {

    private BinarySearchTree<Integer> binarySearchTree;

    private HeightOfBinaryTree heightOfBinaryTree;

    @BeforeEach
    void setup() {
        binarySearchTree = TreeDataUtil.initializeBST();
        heightOfBinaryTree = new HeightOfBinaryTree();
    }

    @Test
    void height() {
        assertEquals(3, heightOfBinaryTree.find(binarySearchTree.getRoot()));
    }

    @Test
    void heightIterative() {
        assertEquals(3, heightOfBinaryTree.findIterative(binarySearchTree.getRoot()));
    }

}