package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LowestCommonAncestor}
 *
 * @author Milan Rathod
 */
class LowestCommonAncestorTest {

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
    void testFindLCA() {
        assertEquals(2, new LowestCommonAncestor().findLCA(binaryTree.getRoot(), 4, 5).key);
    }
}