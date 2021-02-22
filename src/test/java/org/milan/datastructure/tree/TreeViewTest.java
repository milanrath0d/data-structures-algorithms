package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link TreeView}
 *
 * @author Milan Rathod
 */
class TreeViewTest {

    private BinaryTree<Integer> binaryTree;

    private TreeView treeView;

    @BeforeEach
    void setup() {
        treeView = new TreeView();
        binaryTree = TreeDataUtil.initialize();
    }

    @Test
    void testTopView() {
        List<Integer> result = treeView.topView(binaryTree.getRoot());

        assertEquals(5, result.size());

        assertTrue(ListUtil.isEqual(result, Arrays.asList(4, 2, 1, 3, 7)));
    }

    @Test
    void testLeftView() {
        List<Integer> result = treeView.leftView(binaryTree.getRoot());

        assertEquals(3, result.size());

        assertTrue(ListUtil.isEqual(result, Arrays.asList(1, 2, 4)));
    }

    @Test
    void testLeftViewRecursive() {
        List<Integer> result = treeView.leftViewRecursive(binaryTree.getRoot());

        assertEquals(3, result.size());

        assertTrue(ListUtil.isEqual(result, Arrays.asList(1, 2, 4)));
    }

    @Test
    void testRightView() {
        List<Integer> result = treeView.rightView(binaryTree.getRoot());

        assertEquals(3, result.size());

        assertTrue(ListUtil.isEqual(result, Arrays.asList(1, 3, 7)));
    }

    @Test
    void testRightViewRecursive() {
        List<Integer> result = treeView.rightViewRecursive(binaryTree.getRoot());

        assertEquals(3, result.size());

        assertTrue(ListUtil.isEqual(result, Arrays.asList(1, 3, 7)));
    }

    @Test
    void testBottomView() {
        List<Integer> result = treeView.bottomView(binaryTree.getRoot());

        assertEquals(5, result.size());

        assertTrue(ListUtil.isEqual(result, Arrays.asList(4, 2, 6, 3, 7)));
    }
}