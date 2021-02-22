package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Distance}
 *
 * @author Milan Rathod
 */
class DistanceTest {

    private BinaryTree<Integer> binaryTree;

    private Distance distance;

    @BeforeEach
    void setup() {
        distance = new Distance();
        binaryTree = TreeDataUtil.initialize();
    }

    @Test
    void testFindDistance() {
        List<Integer> result = distance.findDistance(binaryTree.getRoot(), binaryTree.getRoot().left, 3);

        assertEquals(2, result.size());

        assertEquals(Arrays.asList(6, 7), result);
    }
}