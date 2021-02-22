package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.milan.datastructure.tree.TreeDataUtil.toArray;

/**
 * Test class for {@link PostOrderWithStack}
 *
 * @author Milan Rathod
 */
class PostOrderWithStackTest {

    private PostOrderWithStack postOrderWithStack;

    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    void setup() {
        postOrderWithStack = new PostOrderWithStack();

        binaryTree = TreeDataUtil.initialize();
    }

    @Test
    void postOrderWithTwoStacks() {
        List<Integer> outputList = postOrderWithStack.postOrderWithTwoStacks(binaryTree.getRoot());

        assertArrayEquals(new int[]{4, 5, 2, 6, 7, 3, 1}, toArray(outputList));
    }

    @Test
    void postOrderWithOneStack() {
        List<Integer> outputList = postOrderWithStack.postOrderWithOneStack(binaryTree.getRoot());

        assertArrayEquals(new int[]{4, 5, 2, 6, 7, 3, 1}, toArray(outputList));
    }
}