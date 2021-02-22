package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ConvertBinaryTree2SumTree}
 *
 * @author Milan Rathod
 */
class ConvertBinaryTree2SumTreeTest {

    @Test
    void testConvert() {
        ConvertBinaryTree2SumTree convertBinaryTree2SumTree = new ConvertBinaryTree2SumTree();

        BinaryTree<Integer> binaryTree = new BinaryTree<>(10);
        binaryTree.getRoot().left = new Node<>(-2);
        binaryTree.getRoot().right = new Node<>(6);
        binaryTree.getRoot().left.left = new Node<>(8);
        binaryTree.getRoot().left.right = new Node<>(-4);
        binaryTree.getRoot().right.left = new Node<>(7);
        binaryTree.getRoot().right.right = new Node<>(5);

        convertBinaryTree2SumTree.convert(binaryTree.getRoot());

        assertEquals(20, binaryTree.getRoot().key);
        assertEquals(4, binaryTree.getRoot().left.key);
        assertEquals(12, binaryTree.getRoot().right.key);
    }
}