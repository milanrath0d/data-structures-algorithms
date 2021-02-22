package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link AncestorsOfNode}
 *
 * @author Milan Rathod
 */
class AncestorsOfNodeTest {

    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    void setup() {
        binaryTree = new BinaryTree<>(1);
        binaryTree.getRoot().left = new Node<>(2);
        binaryTree.getRoot().right = new Node<>(3);
        binaryTree.getRoot().left.left = new Node<>(4);
        binaryTree.getRoot().left.right = new Node<>(5);
        binaryTree.getRoot().right.left = new Node<>(6);
        binaryTree.getRoot().right.right = new Node<>(7);
    }

    @Test
    void testFindAll() {
        AncestorsOfNode ancestorsOfNode = new AncestorsOfNode();

        List<Node<Integer>> result = ancestorsOfNode.findAll(binaryTree.getRoot(), 7);

        assertEquals(3, result.get(0).key);
        assertEquals(1, result.get(1).key);
    }

    @Test
    void testFindAllIterative() {
        AncestorsOfNode ancestorsOfNode = new AncestorsOfNode();

        List<Node<Integer>> result = ancestorsOfNode.findAllIterative(binaryTree.getRoot(), 7);

        assertEquals(3, result.get(0).key);
        assertEquals(1, result.get(1).key);
    }
}