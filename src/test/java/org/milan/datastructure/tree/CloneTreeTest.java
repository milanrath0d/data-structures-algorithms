package org.milan.datastructure.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for {@link CloneTree}
 *
 * @author Milan Rathod
 */
class CloneTreeTest {

    private CloneTree.RandomNode<Integer> randomNode;

    private CloneTree cloneTree;

    @BeforeEach
    void setup() {
        randomNode = new CloneTree.RandomNode<>(1);

        randomNode.left = new CloneTree.RandomNode<>(2);
        randomNode.right = new CloneTree.RandomNode<>(3);

        randomNode.left.left = new CloneTree.RandomNode<>(4);
        randomNode.left.right = new CloneTree.RandomNode<>(5);

        randomNode.random = randomNode.left.right;
        randomNode.left.left.random = randomNode;
        randomNode.left.right.random = randomNode.right;

        cloneTree = new CloneTree();
    }

    @Test
    void cloneUsingHashMap() {
        CloneTree.RandomNode<Integer> clonedRoot = cloneTree.cloneUsingHashMap(randomNode);

        assertCheck(clonedRoot);
    }

    private void assertCheck(CloneTree.RandomNode<Integer> clonedRoot) {
        Assertions.assertEquals(1, clonedRoot.key);

        Assertions.assertEquals(2, clonedRoot.left.key);

        Assertions.assertEquals(3, clonedRoot.right.key);

        Assertions.assertEquals(5, clonedRoot.random.key);

        Assertions.assertEquals(1, clonedRoot.left.left.random.key);
    }
}