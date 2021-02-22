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

    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    void setup() {
        binaryTree = new BinaryTree<>(4);
        binaryTree.getRoot().left = new Node<>(7);
        binaryTree.getRoot().right = new Node<>(5);
        binaryTree.getRoot().left.right = new Node<>(1);
        binaryTree.getRoot().right.left = new Node<>(11);
        binaryTree.getRoot().right.right = new Node<>(6);
    }

    @Test
    void testTraverse() {
        InorderTraversalWithThreadedTree inorderTraversalWithThreadedTree = new InorderTraversalWithThreadedTree();

        List<Integer> traversals = inorderTraversalWithThreadedTree.traverse(binaryTree.getRoot());

        assertEquals(7, traversals.get(0).intValue());
    }
}