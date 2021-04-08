package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link NextSiblings}
 *
 * @author Milan Rathod
 */
class NextSiblingsTest {

    private CustomNode root;

    @BeforeEach
    void setup() {
        root = new CustomNode(1);
        root.left = new CustomNode(2);
        root.right = new CustomNode(3);
        root.left.left = new CustomNode(4);
        root.left.right = new CustomNode(5);
        root.right.left = new CustomNode(6);
        root.right.right = new CustomNode(7);
    }

    @Test
    void testUpdateSiblings() {
        NextSiblings nextSiblings = new NextSiblings();

        CustomNode updatedRoot = nextSiblings.updateSiblings(root);

        assertEquals(3, updatedRoot.left.nextSibling.data);
        assertEquals(6, updatedRoot.left.right.nextSibling.data);
    }
}