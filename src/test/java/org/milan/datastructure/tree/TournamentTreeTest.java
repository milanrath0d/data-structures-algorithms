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
        BinaryTree binaryTree = new BinaryTree(2);
        binaryTree.getRoot().left = new BinaryTree.Node(2);
        binaryTree.getRoot().right = new BinaryTree.Node(5);
        binaryTree.getRoot().left.left = new BinaryTree.Node(2);
        binaryTree.getRoot().left.right = new BinaryTree.Node(4);
        binaryTree.getRoot().right.left = new BinaryTree.Node(5);
        binaryTree.getRoot().right.right = new BinaryTree.Node(7);

        TournamentTree tournamentTree = new TournamentTree();

        int result = tournamentTree.secondMin(binaryTree.getRoot());

        assertEquals(4, result);
    }
}