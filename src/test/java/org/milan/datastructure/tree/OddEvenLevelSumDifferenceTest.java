package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link OddEvenLevelSumDifference}
 *
 * @author Milan Rathod
 */
class OddEvenLevelSumDifferenceTest {

    private OddEvenLevelSumDifference oddEvenLevelSumDifference;

    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    void setup() {
        oddEvenLevelSumDifference = new OddEvenLevelSumDifference();

        binaryTree = TreeDataUtil.initialize();
    }

    @Test
    void get() {
        assertEquals(18, oddEvenLevelSumDifference.get(binaryTree.getRoot()));
    }

    @Test
    void getV2() {
        assertEquals(18, oddEvenLevelSumDifference.getV2(binaryTree.getRoot()));
    }
}