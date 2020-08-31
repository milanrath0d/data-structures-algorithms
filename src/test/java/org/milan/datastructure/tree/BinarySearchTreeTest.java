package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link BinarySearchTree}
 *
 * @author Milan Rathod
 */
class BinarySearchTreeTest {

    private BinarySearchTree binarySearchTree;

    @BeforeEach
    void setup() {
        binarySearchTree = new BinarySearchTree(20);

        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(5);
        binarySearchTree.insert(30);
        binarySearchTree.insert(35);
        binarySearchTree.insert(25);
    }

    @Test
    void testPreOrder() {
        String result = binarySearchTree.preOrder(binarySearchTree.getRoot());

        assertEquals("2010515302535", result);
    }

    @Test
    void testPreOrderIterative() {
        String result = binarySearchTree.preOrderIterative(binarySearchTree.getRoot());

        assertEquals("2010515302535", result);
    }

    @Test
    void testInOrder() {
        String result = binarySearchTree.inOrder(binarySearchTree.getRoot());

        assertEquals("5101520253035", result);
    }

    @Test
    void testInOrderIterative() {
        String result = binarySearchTree.inOrderIterative(binarySearchTree.getRoot());

        assertEquals("5101520253035", result);
    }

    @Test
    void testPostOrder() {
        String result = binarySearchTree.postOrder(binarySearchTree.getRoot());

        assertEquals("5151025353020", result);
    }

    @Test
    void testPostOrderIterative() {
        String result = binarySearchTree.postOrderIterative(binarySearchTree.getRoot());

        assertEquals("5151025353020", result);
    }

    @Test
    void testLevelOrder() {
        String result = binarySearchTree.levelOrder(binarySearchTree.getRoot());

        assertEquals("2010305152535", result);
    }

    @Test
    void testLevelOrderReverse() {
        String result = binarySearchTree.levelOrderReverse(binarySearchTree.getRoot());

        assertEquals("5152535103020", result);
    }

    @Test
    void testSize() {
        assertEquals(7, binarySearchTree.size(binarySearchTree.getRoot()));
    }

    @Test
    void testSizeIterative() {
        assertEquals(7, binarySearchTree.sizeIterative(binarySearchTree.getRoot()));
    }

    @Test
    void testHeight() {
        assertEquals(3, binarySearchTree.height(binarySearchTree.getRoot()));
    }

    @Test
    void testHeightIterative() {
        assertEquals(3, binarySearchTree.heightIterative(binarySearchTree.getRoot()));
    }

    @Test
    void testMinimumDepth() {
        assertEquals(3, binarySearchTree.minimumDepth(binarySearchTree.getRoot()));
    }

    @Test
    void testFindDeepestNode() {
        assertEquals(35, binarySearchTree.findDeepestNode(binarySearchTree.getRoot()).key);
    }

    @Test
    void testGetTotalLeafNodes() {
        assertEquals(4, binarySearchTree.getTotalLeafNodes(binarySearchTree.getRoot()));
    }

    @Test
    void testGetTotalLeafNodesIterative() {
        assertEquals(4, binarySearchTree.getTotalLeafNodesIterative(binarySearchTree.getRoot()));
    }

    @Test
    void testMaximumWidth() {
        assertEquals(4, binarySearchTree.maximumWidth(binarySearchTree.getRoot()));
    }

    @Test
    void testFindMaximumLevelSum() {
        assertEquals(80, binarySearchTree.findMaximumLevelSum(binarySearchTree.getRoot()));
    }

    @Test
    void testLca() {
        assertEquals(20, binarySearchTree.lca(binarySearchTree.getRoot(), 5, 35).key);
        assertEquals(30, binarySearchTree.lca(binarySearchTree.getRoot(), 25, 35).key);
    }

    @Test
    void testIsBST() {
        assertTrue(binarySearchTree.isBST(binarySearchTree.getRoot()));
    }
}