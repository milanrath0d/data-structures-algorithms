package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link VerticalSum}
 *
 * @author Milan Rathod
 */
class VerticalSumTest {

    private BinaryTree binaryTree;

    private VerticalSum verticalSum;

    @BeforeEach
    void setup() {
        verticalSum = new VerticalSum();
        binaryTree = new BinaryTree(1);
        binaryTree.getRoot().left = new BinaryTree.Node(2);
        binaryTree.getRoot().right = new BinaryTree.Node(3);
        binaryTree.getRoot().left.left = new BinaryTree.Node(4);
        binaryTree.getRoot().left.right = new BinaryTree.Node(5);
        binaryTree.getRoot().right.left = new BinaryTree.Node(6);
        binaryTree.getRoot().right.right = new BinaryTree.Node(7);
    }

    @Test
    void testComputeSum() {
        List<Integer> result = verticalSum.computeSum(binaryTree.getRoot());

        Collections.sort(result);

        assertEquals(result, List.of(2, 3, 4, 7, 12));
    }

    @Test
    void testSumUsingDLL() {
        List<Integer> result = verticalSum.sumUsingDLL(binaryTree.getRoot());

        Collections.sort(result);

        assertEquals(result, List.of(2, 3, 4, 7, 12));
    }
}