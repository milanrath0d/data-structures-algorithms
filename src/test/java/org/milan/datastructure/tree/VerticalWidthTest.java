package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Milan Rathod
 */
class VerticalWidthTest {

    private BinaryTree<Integer> binaryTree;

    private VerticalWidth verticalWidth;

    @BeforeEach
    void setup() {
        verticalWidth = new VerticalWidth();
        binaryTree = TreeDataUtil.initialize();

    }

    @Test
    void testPreorderGet() {
        int result = verticalWidth.get(binaryTree.getRoot());

        assertEquals(5, result);
    }
}