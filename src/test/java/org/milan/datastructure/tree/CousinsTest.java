package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link Cousins}
 *
 * @author Milan Rathod
 */
class CousinsTest {

    private BinaryTree<Integer> binaryTree;

    private Cousins cousins;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree<>(4);
        binaryTree.getRoot().left = new Node<>(7);
        binaryTree.getRoot().right = new Node<>(5);
        binaryTree.getRoot().left.left = new Node<>(1);
        binaryTree.getRoot().left.right = new Node<>(8);
        binaryTree.getRoot().right.left = new Node<>(11);
        binaryTree.getRoot().right.right = new Node<>(6);

        cousins = new Cousins();
    }

    @Test
    void testIsCousins() {
        assertTrue(cousins.isCousins(binaryTree.getRoot(), new Node<>(1), new Node<>(11)));

        assertFalse(cousins.isCousins(binaryTree.getRoot(), new Node<>(1), new Node<>(8)));
    }

    @Test
    void testIsCousinsV2() {
        assertTrue(cousins.isCousinsV2(binaryTree.getRoot(), new Node<>(1), new Node<>(11)));

        assertFalse(cousins.isCousinsV2(binaryTree.getRoot(), new Node<>(1), new Node<>(8)));
    }
}