package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinMaxInBinaryTree}
 *
 * @author Milan Rathod
 */
class MinMaxInBinaryTreeTest {

    private static MinMaxInBinaryTree minMaxInBinaryTree;

    @BeforeAll
    static void setup() {
        minMaxInBinaryTree = new MinMaxInBinaryTree();
        BinaryTree<Integer> binaryTree = TreeDataUtil.initialize();
        minMaxInBinaryTree.compute(binaryTree.getRoot());
    }

    @Test
    void getMaxElement() {
        assertEquals(7, minMaxInBinaryTree.getMaxElement());
    }

    @Test
    void getMinElement() {
        assertEquals(1, minMaxInBinaryTree.getMinElement());
    }
}