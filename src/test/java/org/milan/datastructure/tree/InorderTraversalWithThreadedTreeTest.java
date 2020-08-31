package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link InorderTraversalWithThreadedTree}
 *
 * @author Milan Rathod
 */
class InorderTraversalWithThreadedTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setup() {
        binaryTree = new BinaryTree(4);
        binaryTree.getRoot().left = new BinaryTree.Node(7);
        binaryTree.getRoot().right = new BinaryTree.Node(5);
        binaryTree.getRoot().left.right = new BinaryTree.Node(1);
        binaryTree.getRoot().right.left = new BinaryTree.Node(11);
        binaryTree.getRoot().right.right = new BinaryTree.Node(6);
    }

    @Test
    void testTraverse() {
        InorderTraversalWithThreadedTree inorderTraversalWithThreadedTree = new InorderTraversalWithThreadedTree();

        List<Integer> traversals = inorderTraversalWithThreadedTree.traverse(binaryTree.getRoot());

        assertEquals(7, traversals.get(0).intValue());
    }
}