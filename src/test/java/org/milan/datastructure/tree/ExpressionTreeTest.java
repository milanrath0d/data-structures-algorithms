package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ExpressionTree}
 *
 * @author Milan Rathod
 */
class ExpressionTreeTest {

    @Test
    void testConstructTree() {
        ExpressionTree expressionTree = new ExpressionTree();

        TreeNode<Character> root = expressionTree.constructTree("ABC*+D/".toCharArray());

        assertEquals('/', root.key.charValue());
        assertEquals('+', root.left.key.charValue());
        assertEquals('D', root.right.key.charValue());
    }
}