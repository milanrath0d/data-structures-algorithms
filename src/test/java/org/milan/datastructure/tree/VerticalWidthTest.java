package org.milan.datastructure.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Milan Rathod
 */
public class VerticalWidthTest {

    private BinaryTree binaryTree;

    private VerticalWidth verticalWidth;

    @Before
    public void setup() {
        verticalWidth = new VerticalWidth();
        binaryTree = new BinaryTree(1);
        binaryTree.getRoot().left = new BinaryTree.Node(2);
        binaryTree.getRoot().right = new BinaryTree.Node(3);
        binaryTree.getRoot().left.left = new BinaryTree.Node(4);
        binaryTree.getRoot().left.right = new BinaryTree.Node(5);
        binaryTree.getRoot().right.left = new BinaryTree.Node(6);
        binaryTree.getRoot().right.right = new BinaryTree.Node(7);
    }

    @Test
    public void testPreorderGet() {
        int result = verticalWidth.get(binaryTree.getRoot());

        Assert.assertEquals(5, result);
    }
}