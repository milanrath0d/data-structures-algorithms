package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LowestCommonAncestor}
 *
 * @author Milan Rathod
 */
class LowestCommonAncestorTest {

    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    void setup() {
        binaryTree = TreeDataUtil.initialize();
    }

    @Test
    void testFindLCA() {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

        Node<Integer> lca = lowestCommonAncestor.findLCA(binaryTree.getRoot(), 4, 5);

        assertEquals(2, lca.key);
    }
}