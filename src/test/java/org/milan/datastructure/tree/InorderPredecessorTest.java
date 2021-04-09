package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link InorderPredecessor}
 *
 * @author Milan Rathod
 */
class InorderPredecessorTest {

    @Test
    void find() {
        InorderPredecessor inorderPredecessor = new InorderPredecessor();

        BinaryTree<Integer> binaryTree = TreeDataUtil.initialize();

        // Search for node with value 3
        Node<Integer> result = inorderPredecessor.find(binaryTree.getRoot(), binaryTree.getRoot().right.left);

        assertEquals(1, result.key);

        // Search for node with value 4
        result = inorderPredecessor.find(binaryTree.getRoot(), binaryTree.getRoot().left.left);

        assertNull(result);

        // Search for node with value 2
        result = inorderPredecessor.find(binaryTree.getRoot(), binaryTree.getRoot().left);

        assertEquals(4, result.key);
    }
}