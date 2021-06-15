package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.milan.datastructure.tree.TreeDataUtil.initialize;
import static org.milan.datastructure.tree.TreeDataUtil.toArray;

/**
 * Test class for {@link KDistanceFromRoot}
 *
 * @author Milan Rathod
 */
class KDistanceFromRootTest {

    private BinaryTree<Integer> binaryTree;

    private KDistanceFromRoot kDistanceFromRoot;

    @BeforeEach
    void setup() {
        kDistanceFromRoot = new KDistanceFromRoot();

        binaryTree = initialize();
    }

    @Test
    void getAll() {
        List<Integer> outputList = kDistanceFromRoot.getAll(binaryTree.getRoot(), 2);

        assertArrayEquals(new int[]{4, 5, 6, 7}, toArray(outputList));
    }

    @Test
    void getAllIterative() {
        List<Integer> outputList = kDistanceFromRoot.getAllIterative(binaryTree.getRoot(), 2);

        assertArrayEquals(new int[]{4, 5, 6, 7}, toArray(outputList));
    }
}