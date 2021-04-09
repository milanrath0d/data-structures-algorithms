package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LeafNodesCount}
 *
 * @author Milan Rathod
 */
class LeafNodesCountTest {

    private BinaryTree<Integer> binaryTree;

    private LeafNodesCount leafNodesCount;

    @BeforeEach
    void setup() {
        binaryTree = TreeDataUtil.initialize();

        leafNodesCount = new LeafNodesCount();
    }

    @Test
    void getTotalLeafNodes() {
        assertEquals(4, leafNodesCount.getTotalLeafNodes(binaryTree.getRoot()));
    }

    @Test
    void getTotalLeafNodesIterative() {
        assertEquals(4, leafNodesCount.getTotalLeafNodesIterative(binaryTree.getRoot()));
    }

}