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

    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    void setup() {
        binaryTree = TreeDataUtil.initialize();
    }

    @Test
    void testTraverse() {
        assertEquals("1 3 2 4 5 6 7",
                new ZigZagTraversal().traverse(binaryTree.getRoot()));
    }
}