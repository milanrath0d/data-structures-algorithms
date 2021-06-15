package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TernaryExpressionToBinaryTree}
 *
 * @author Milan Rathod
 */
class TernaryExpressionToBinaryTreeTest {

    @Test
    void convert() {
        String expression = "a?b?c:d:e";

        TernaryExpressionToBinaryTree ternaryExpressionToBinaryTree = new TernaryExpressionToBinaryTree();

        Node<Character> root = ternaryExpressionToBinaryTree.convert(expression);

        assertEquals('a', root.key);
        assertEquals('b', root.left.key);
        assertEquals('c', root.left.left.key);
        assertEquals('d', root.left.right.key);
        assertEquals('e', root.right.key);
    }
}