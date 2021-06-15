package org.milan.datastructure.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class for {@link BinaryTreeFromInOrderAndPreOrder}
 *
 * @author Milan Rathod
 */
class BinaryTreeFromInOrderAndPreOrderTest {

    @Test
    void buildTree() {
        BinaryTreeFromInOrderAndPreOrder binaryTreeFromInOrderAndPreOrder = new BinaryTreeFromInOrderAndPreOrder();

        char[] inOrder = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char[] preOrder = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};

        TreeNode<Character> binaryTree = binaryTreeFromInOrderAndPreOrder.buildTree(inOrder, preOrder);

        Assertions.assertNotNull(binaryTree);
    }

    @Test
    void buildTreeV2() {
        BinaryTreeFromInOrderAndPreOrder binaryTreeFromInOrderAndPreOrder = new BinaryTreeFromInOrderAndPreOrder();

        char[] inOrder = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char[] preOrder = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};

        TreeNode<Character> binaryTree = binaryTreeFromInOrderAndPreOrder.buildTreeV2(inOrder, preOrder);

        Assertions.assertNotNull(binaryTree);
    }

}