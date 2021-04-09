package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link KDistanceFromNode}
 *
 * @author Milan Rathod
 */
class KDistanceFromNodeTest {

    private BinaryTree<Integer> binaryTree;

    private KDistanceFromNode kDistanceFromNode;

    @BeforeEach
    void setup() {
        kDistanceFromNode = new KDistanceFromNode();
        binaryTree = TreeDataUtil.initialize();
    }

    @Test
    void testFindDistance() {
        List<Integer> result = kDistanceFromNode.findDistance(binaryTree.getRoot(), binaryTree.getRoot().left, 3);

        assertEquals(2, result.size());

        assertEquals(Arrays.asList(6, 7), result);
    }
}