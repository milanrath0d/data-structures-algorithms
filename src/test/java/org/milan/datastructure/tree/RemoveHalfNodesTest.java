package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Test class for {@link RemoveHalfNodes}
 *
 * @author Milan Rathod
 */
class RemoveHalfNodesTest {

    @Test
    void remove() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(1);
        binaryTree.getRoot().left = new Node<>(2);
        binaryTree.getRoot().right = new Node<>(3);
        binaryTree.getRoot().left.left = new Node<>(4);
        binaryTree.getRoot().right.left = new Node<>(5);
        binaryTree.getRoot().right.right = new Node<>(6);

        RemoveHalfNodes removeHalfNodes = new RemoveHalfNodes();

        Node<Integer> newRoot = removeHalfNodes.remove(binaryTree.getRoot());

        assertNotEquals(2, newRoot.left.key);
        assertEquals(4, newRoot.left.key);
    }
}