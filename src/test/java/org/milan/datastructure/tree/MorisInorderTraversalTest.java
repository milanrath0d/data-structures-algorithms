package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link MorisInorderTraversal}
 *
 * @author Milan Rathod
 */
class MorisInorderTraversalTest {

    @Test
    void traverse() {
        BinaryTree<Integer> binaryTree = TreeDataUtil.initialize();

        MorisInorderTraversal morisInorderTraversal = new MorisInorderTraversal();

        List<Integer> traversalList = morisInorderTraversal.traverse(binaryTree.getRoot());

        assertArrayEquals(new int[]{4, 2, 5, 1, 6, 3, 7}, TreeDataUtil.toArray(traversalList));
    }
}