package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

/**
 * Test Class for {@link BinaryTreeFromInOrderAndPreOrder}
 *
 * @author Milan Rathod
 */
class BinaryTreeFromInOrderAndPreOrderTest {

    @Test
    void testBuildTree() {
        BinaryTreeFromInOrderAndPreOrder binaryTreeFromInOrderAndPreOrder = new BinaryTreeFromInOrderAndPreOrder();

        char[] inOrder = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char[] preOrder = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};

        binaryTreeFromInOrderAndPreOrder.buildTree(inOrder, preOrder);
    }
}