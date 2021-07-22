package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link DiameterOfBinaryTree}
 *
 * @author Milan Rathod
 */
class DiameterOfBinaryTreeTest {

    @Test
    void diameterOfBinaryTree() {
        Node<Integer> root = new Node<>(1);
        root.left = new Node<>(2);
        root.right = new Node<>(3);
        root.left.left = new Node<>(4);
        root.left.right = new Node<>(5);

        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(root));

        root = new Node<>(1);
        root.right = new Node<>(2);

        assertEquals(1, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }
}