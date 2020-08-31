package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link VerticalTraversal}
 *
 * @author Milan Rathod
 */
class VerticalTraversalTest {

    private VerticalTraversal verticalTraversal;

    private BinaryTree binaryTree;

    @BeforeEach
    void setup() {
        verticalTraversal = new VerticalTraversal();
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
        List<String> result = verticalTraversal.traverse(binaryTree.getRoot());

        assertEquals(5, result.size());
    }

    @Test
    void testTraverseV2() {
        verticalTraversal.traverseV2(binaryTree.getRoot());
    }
}