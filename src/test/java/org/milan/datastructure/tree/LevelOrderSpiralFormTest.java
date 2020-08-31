package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link LevelOrderSpiralForm}
 *
 * @author Milan Rathod
 */
class LevelOrderSpiralFormTest {

    private BinaryTree binaryTree;

    private LevelOrderSpiralForm levelOrderSpiralForm;

    @BeforeEach
    void setup() {
        levelOrderSpiralForm = new LevelOrderSpiralForm();
        binaryTree = new BinaryTree(1);
        binaryTree.getRoot().left = new BinaryTree.Node(2);
        binaryTree.getRoot().right = new BinaryTree.Node(3);
        binaryTree.getRoot().left.left = new BinaryTree.Node(4);
        binaryTree.getRoot().left.right = new BinaryTree.Node(5);
        binaryTree.getRoot().right.left = new BinaryTree.Node(6);
        binaryTree.getRoot().right.right = new BinaryTree.Node(7);
    }

    @Test
    void testUsingTwoStacks() {
        List<Integer> result = levelOrderSpiralForm.usingTwoStacks(binaryTree.getRoot());

        assertTrue(ListUtil.isEqual(result, expectedResultList()));
    }

    @Test
    void testUsingQueueAndStack() {
        List<Integer> result = levelOrderSpiralForm.usingQueueAndStack(binaryTree.getRoot());

        assertTrue(ListUtil.isEqual(result, expectedResultList()));
    }

    @Test
    void testUsingDeque() {
        List<Integer> result = levelOrderSpiralForm.usingDeque(binaryTree.getRoot());

        assertTrue(ListUtil.isEqual(result, expectedResultList()));
    }

    private List<Integer> expectedResultList() {
        return Arrays.asList(1, 2, 3, 7, 6, 5, 4);
    }
}