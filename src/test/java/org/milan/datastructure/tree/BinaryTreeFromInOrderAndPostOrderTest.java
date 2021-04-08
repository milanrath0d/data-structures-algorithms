package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link BinaryTreeFromInOrderAndPostOrder}
 *
 * @author Milan Rathod
 */
class BinaryTreeFromInOrderAndPostOrderTest {

    @Test
    void testBuildTree() {
        BinaryTreeFromInOrderAndPostOrder binaryTreeFromInOrderAndPostOrder = new BinaryTreeFromInOrderAndPostOrder();

        char[] inOrder = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char[] postOrder = new char[]{'D', 'E', 'B', 'C', 'F', 'A'};

        binaryTreeFromInOrderAndPostOrder.buildTree(inOrder, postOrder);
    }
}