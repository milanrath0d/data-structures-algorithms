package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link InorderSuccessor}
 *
 * @author Milan Rathod
 */
class InorderSuccessorTest {

    private BinaryTree<Integer> binaryTree;

    private InorderSuccessor inorderSuccessor;

    @BeforeEach
    void setup() {
        binaryTree = TreeDataUtil.initialize();

        inorderSuccessor = new InorderSuccessor();
    }

    @Test
    void find() {
        // Search for node with value 5
        Node<Integer> result = inorderSuccessor.find(binaryTree.getRoot(), binaryTree.getRoot().left.right);

        assertEquals(1, result.key);

        // Search for node with value 7
        result = inorderSuccessor.find(binaryTree.getRoot(), binaryTree.getRoot().right.right);

        assertNull(result);

        // Search for node with value 2
        result = inorderSuccessor.find(binaryTree.getRoot(), binaryTree.getRoot().left);

        assertEquals(5, result.key);
    }

    @Test
    void findV2() {
        // Search for node with value 5
        Node<Integer> result = inorderSuccessor.findV2(binaryTree.getRoot(), binaryTree.getRoot().left.right);

        assertEquals(1, result.key);

        // Search for node with value 7
        result = inorderSuccessor.findV2(binaryTree.getRoot(), binaryTree.getRoot().right.right);

        assertNull(result);

        // Search for node with value 2
        result = inorderSuccessor.findV2(binaryTree.getRoot(), binaryTree.getRoot().left);

        assertEquals(5, result.key);
    }
}