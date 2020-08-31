package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ZigZagTraversal}
 *
 * @author Milan Rathod
 */
class ZigZagTraversalTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setup() {
        binaryTree = new BinaryTree(1);
        binaryTree.getRoot().left = new BinaryTree.Node(2);
        binaryTree.getRoot().right = new BinaryTree.Node(3);
        binaryTree.getRoot().left.left = new BinaryTree.Node(4);
        binaryTree.getRoot().left.right = new BinaryTree.Node(5);
        binaryTree.getRoot().right.left = new BinaryTree.Node(6);
        binaryTree.getRoot().right.right = new BinaryTree.Node(7);
    }

    @Test
    void testTraverse() {
        assertEquals("1 3 2 4 5 6 7", new ZigZagTraversal().traverse(binaryTree.getRoot()));
    }
}