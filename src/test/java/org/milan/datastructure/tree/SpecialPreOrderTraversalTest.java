package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SpecialPreOrderTraversal}
 *
 * @author Milan Rathod
 */
class SpecialPreOrderTraversalTest {

    @Test
    void constructTree() {
        int[] pre = new int[]{10, 30, 20, 5, 15};
        char[] preLN = new char[]{'N', 'N', 'L', 'L', 'L'};

        BinaryTree binaryTree = new BinaryTree();
        SpecialPreOrderTraversal specialPreOrderTraversal = new SpecialPreOrderTraversal();

        BinaryTree.Node newRoot = specialPreOrderTraversal.constructTree(pre, preLN, binaryTree.getRoot());

        assertEquals(10, newRoot.key);
        assertEquals(30, newRoot.getLeft().key);
        assertEquals(15, newRoot.getRight().key);
        assertEquals(20, newRoot.getLeft().getLeft().key);
        assertEquals(5, newRoot.getLeft().getRight().key);
    }
}