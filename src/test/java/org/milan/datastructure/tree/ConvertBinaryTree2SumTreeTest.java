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

        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.getRoot().left = new BinaryTree.Node(-2);
        binaryTree.getRoot().right = new BinaryTree.Node(6);
        binaryTree.getRoot().left.left = new BinaryTree.Node(8);
        binaryTree.getRoot().left.right = new BinaryTree.Node(-4);
        binaryTree.getRoot().right.left = new BinaryTree.Node(7);
        binaryTree.getRoot().right.right = new BinaryTree.Node(5);

        convertBinaryTree2SumTree.convert(binaryTree.getRoot());

        assertEquals(20, binaryTree.getRoot().key);
        assertEquals(4, binaryTree.getRoot().left.key);
        assertEquals(12, binaryTree.getRoot().right.key);
    }
}