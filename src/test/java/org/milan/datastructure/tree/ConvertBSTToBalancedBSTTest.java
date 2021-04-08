package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link ConvertBSTToBalancedBST}
 *
 * @author Milan Rathod
 */
class ConvertBSTToBalancedBSTTest {

    @Test
    void convert() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(30);
        binarySearchTree.getRoot().left = new Node<>(20);
        binarySearchTree.getRoot().left.left = new Node<>(10);

        ConvertBSTToBalancedBST convertBSTToBalancedBST = new ConvertBSTToBalancedBST();

        Node<Integer> newRoot = convertBSTToBalancedBST.convert(binarySearchTree.getRoot());

        assertEquals(20, newRoot.key);
        assertEquals(10, newRoot.left.key);
        assertEquals(30, newRoot.right.key);
    }
}