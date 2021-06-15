package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link MirrorTree}
 *
 * @author Milan Rathod
 */
class MirrorTreeTest {

    private BinaryTree<Integer> binaryTree;

    private MirrorTree mirrorTree;

    @BeforeEach
    void setup() {
        binaryTree = new BinaryTree<>(4);
        binaryTree.getRoot().left = new Node<>(7);
        binaryTree.getRoot().right = new Node<>(5);
        binaryTree.getRoot().left.right = new Node<>(1);
        binaryTree.getRoot().right.left = new Node<>(11);
        binaryTree.getRoot().right.right = new Node<>(6);

        mirrorTree = new MirrorTree();
    }

    @Test
    void testMirrorTreeIterative() {

        mirrorTree.mirrorTreeIterative(binaryTree.getRoot());

        assertTrue(binaryTree.isIdentical(binaryTree.getRoot(), getMirrorBinaryTree().getRoot()));
    }

    @Test
    void testMirrorTree() {
        Node<Integer> mirrorTreeRoot = mirrorTree.mirrorTree(binaryTree.getRoot());

        assertTrue(binaryTree.isIdentical(mirrorTreeRoot, getMirrorBinaryTree().getRoot()));
    }

    @Test
    void testIsMirror() {
        assertTrue(mirrorTree.isMirror(binaryTree.getRoot(), getMirrorBinaryTree().getRoot()));
    }

    private BinaryTree<Integer> getMirrorBinaryTree() {
        BinaryTree<Integer> mirrorBinaryTree = new BinaryTree<>(4);

        mirrorBinaryTree.getRoot().left = new Node<>(5);
        mirrorBinaryTree.getRoot().right = new Node<>(7);
        mirrorBinaryTree.getRoot().right.left = new Node<>(1);
        mirrorBinaryTree.getRoot().left.left = new Node<>(6);
        mirrorBinaryTree.getRoot().left.right = new Node<>(11);

        return mirrorBinaryTree;
    }

}