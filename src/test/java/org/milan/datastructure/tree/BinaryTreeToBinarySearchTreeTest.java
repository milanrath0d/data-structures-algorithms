package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link BinaryTreeToBinarySearchTree}
 *
 * @author Milan Rathod
 */
class BinaryTreeToBinarySearchTreeTest {

    @Test
    void binaryToBST() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(4);
        binaryTree.getRoot().left = new Node<>(7);
        binaryTree.getRoot().right = new Node<>(5);
        binaryTree.getRoot().left.right = new Node<>(1);
        binaryTree.getRoot().right.left = new Node<>(11);
        binaryTree.getRoot().right.right = new Node<>(6);

        BinaryTreeToBinarySearchTree binaryTreeToBinarySearchTree = new
                BinaryTreeToBinarySearchTree();

        binaryTreeToBinarySearchTree.binaryToBST(binaryTree.getRoot());

        assertEquals(5, binaryTree.getRoot().key);
        assertEquals(1, binaryTree.getRoot().left.key);
        assertEquals(7, binaryTree.getRoot().right.key);
        assertEquals(4, binaryTree.getRoot().left.right.key);
        assertEquals(6, binaryTree.getRoot().right.left.key);
        assertEquals(11, binaryTree.getRoot().right.right.key);
    }
}