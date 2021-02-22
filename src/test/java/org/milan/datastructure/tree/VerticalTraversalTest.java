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

    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    void setup() {
        verticalTraversal = new VerticalTraversal();
        binaryTree = TreeDataUtil.initialize();
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