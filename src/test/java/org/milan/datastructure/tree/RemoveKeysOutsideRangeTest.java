package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link RemoveKeysOutsideRange}
 *
 * @author Milan Rathod
 */
class RemoveKeysOutsideRangeTest {

    @Test
    void removeOutsideRange() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(6);

        binarySearchTree.getRoot().left = new Node<>(-13);
        binarySearchTree.getRoot().left.right = new Node<>(-8);
        binarySearchTree.getRoot().right = new Node<>(14);
        binarySearchTree.getRoot().right.left = new Node<>(13);
        binarySearchTree.getRoot().right.right = new Node<>(15);
        binarySearchTree.getRoot().right.left.left = new Node<>(7);

        RemoveKeysOutsideRange removeKeysOutsideRange = new RemoveKeysOutsideRange();

        Node<Integer> root = removeKeysOutsideRange.remove(binarySearchTree.getRoot(), -10, 13);

        assertEquals(6, root.key);
        assertEquals(-8, root.left.key);
        assertEquals(13, root.right.key);
        assertEquals(7, root.right.left.key);
    }
}