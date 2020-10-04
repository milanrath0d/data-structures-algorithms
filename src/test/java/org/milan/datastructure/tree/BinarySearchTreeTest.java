package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
        List<Integer> result = binarySearchTree.preOrder(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{20, 10, 5, 15, 30, 25, 35}, toArray(result));
    }

    @Test
    void testPreOrderIterative() {
        List<Integer> result = binarySearchTree.preOrderIterative(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{20, 10, 5, 15, 30, 25, 35}, toArray(result));
    }

    @Test
    void testInOrder() {
        List<Integer> result = binarySearchTree.inOrder(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 10, 15, 20, 25, 30, 35}, toArray(result));
    }

    @Test
    void testInOrderIterative() {
        List<Integer> result = binarySearchTree.inOrderIterative(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 10, 15, 20, 25, 30, 35}, toArray(result));
    }

    @Test
    void testPostOrder() {
        List<Integer> result = binarySearchTree.postOrder(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 15, 10, 25, 35, 30, 20}, toArray(result));
    }

    @Test
    void testPostOrderIterative() {
        List<Integer> result = binarySearchTree.postOrderIterative(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 15, 10, 25, 35, 30, 20}, toArray(result));
    }

    @Test
    void testLevelOrder() {
        List<Integer> result = binarySearchTree.levelOrder(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{20, 10, 30, 5, 15, 25, 35}, toArray(result));
    }

    @Test
    void testLevelOrderReverse() {
        List<Integer> result = binarySearchTree.levelOrderReverse(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 15, 25, 35, 10, 30, 20}, toArray(result));
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

    private int[] toArray(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}