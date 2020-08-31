package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for {@link BinaryTree}
 *
 * @author Milan Rathod
 */
class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setup() {
        binaryTree = new BinaryTree(4);
        binaryTree.getRoot().left = new BinaryTree.Node(7);
        binaryTree.getRoot().right = new BinaryTree.Node(5);
        binaryTree.getRoot().left.right = new BinaryTree.Node(1);
        binaryTree.getRoot().right.left = new BinaryTree.Node(11);
        binaryTree.getRoot().right.right = new BinaryTree.Node(6);
    }

    @Test
    void testFindMaximumElement() {
        int result = binaryTree.findMaximumElement(binaryTree.getRoot());

        assertEquals(11, result);
    }

    @Test
    void testFindMaximumElementIterative() {
        int result = binaryTree.findMaximumElementIterative(binaryTree.getRoot());

        assertEquals(11, result);
    }

    @Test
    void testFindMinimumElement() {
        int result = binaryTree.findMinimumElement(binaryTree.getRoot());

        assertEquals(1, result);
    }

    @Test
    void testIsPresent() {
        assertTrue(binaryTree.isPresent(binaryTree.getRoot(), 11));

        assertFalse(binaryTree.isPresent(binaryTree.getRoot(), 3));
    }

    @Test
    void testIsPresentIterative() {
        assertTrue(binaryTree.isPresentIterative(binaryTree.getRoot(), 11));

        assertFalse(binaryTree.isPresentIterative(binaryTree.getRoot(), 3));
    }

    @Test
    void testMirrorTreeIterative() {
        binaryTree.mirrorTreeIterative(binaryTree.getRoot());

        assertTrue(binaryTree.isIdentical(binaryTree.getRoot(), getMirrorBinaryTree().getRoot()));
    }

    @Test
    void testMirrorTree() {
        BinaryTree.Node mirrorTreeRoot = binaryTree.mirrorTree(binaryTree.getRoot());

        assertTrue(binaryTree.isIdentical(mirrorTreeRoot, getMirrorBinaryTree().getRoot()));
    }

    @Test
    void testIsMirror() {
        assertTrue(binaryTree.isMirror(binaryTree.getRoot(), getMirrorBinaryTree().getRoot()));
    }

    private BinaryTree getMirrorBinaryTree() {
        BinaryTree mirrorBinaryTree = new BinaryTree(4);

        mirrorBinaryTree.getRoot().left = new BinaryTree.Node(5);
        mirrorBinaryTree.getRoot().right = new BinaryTree.Node(7);
        mirrorBinaryTree.getRoot().right.left = new BinaryTree.Node(1);
        mirrorBinaryTree.getRoot().left.left = new BinaryTree.Node(6);
        mirrorBinaryTree.getRoot().left.right = new BinaryTree.Node(11);

        return mirrorBinaryTree;
    }

}