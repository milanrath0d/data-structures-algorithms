package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TournamentTree}
 *
 * @author Milan Rathod
 */
class TournamentTreeTest {

    @Test
    void testSecondMin() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(2);
        binaryTree.getRoot().left = new Node<>(2);
        binaryTree.getRoot().right = new Node<>(5);
        binaryTree.getRoot().left.left = new Node<>(2);
        binaryTree.getRoot().left.right = new Node<>(4);
        binaryTree.getRoot().right.left = new Node<>(5);
        binaryTree.getRoot().right.right = new Node<>(7);

        TournamentTree tournamentTree = new TournamentTree();

        int result = tournamentTree.secondMin(binaryTree.getRoot());

        assertEquals(4, result);
    }
}