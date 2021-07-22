package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link MergeBSTsIntoSingleBST}
 *
 * @author Milan Rathod
 */
class MergeBSTsIntoSingleBSTTest {

    @Test
    void canMerge() {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(5);

        TreeNode root3 = new TreeNode(5);
        root3.left = new TreeNode(4);

        MergeBSTsIntoSingleBST mergeBSTsIntoSingleBST = new MergeBSTsIntoSingleBST();

        List<TreeNode> trees = new ArrayList<>();
        trees.add(root1);
        trees.add(root2);
        trees.add(root3);

        TreeNode treeNode = mergeBSTsIntoSingleBST.canMerge(trees);

        assertEquals(3, treeNode.val);
    }

    @Test
    void canMergeV2() {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(8);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(6);

        MergeBSTsIntoSingleBST mergeBSTsIntoSingleBST = new MergeBSTsIntoSingleBST();

        List<TreeNode> trees = new ArrayList<>();
        trees.add(root1);
        trees.add(root2);

        TreeNode treeNode = mergeBSTsIntoSingleBST.canMerge(trees);

        assertNull(treeNode);
    }

    @Test
    void canMergeV3() {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);

        TreeNode root2 = new TreeNode(3);

        MergeBSTsIntoSingleBST mergeBSTsIntoSingleBST = new MergeBSTsIntoSingleBST();

        List<TreeNode> trees = new ArrayList<>();
        trees.add(root1);
        trees.add(root2);

        TreeNode treeNode = mergeBSTsIntoSingleBST.canMerge(trees);

        assertNull(treeNode);
    }

    @Test
    void canMergeV4() {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.left = new TreeNode(3);

        MergeBSTsIntoSingleBST mergeBSTsIntoSingleBST = new MergeBSTsIntoSingleBST();

        List<TreeNode> trees = new ArrayList<>();
        trees.add(root1);

        TreeNode treeNode = mergeBSTsIntoSingleBST.canMerge(trees);

        assertEquals(2, treeNode.val);
    }

    @Test
    void canMergeV5() {
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(9);

        TreeNode root2 = new TreeNode(9);
        root2.left = new TreeNode(8);

        TreeNode root3 = new TreeNode(8);
        root3.left = new TreeNode(7);

        MergeBSTsIntoSingleBST mergeBSTsIntoSingleBST = new MergeBSTsIntoSingleBST();

        List<TreeNode> trees = new ArrayList<>();
        trees.add(root1);
        trees.add(root2);
        trees.add(root3);

        TreeNode treeNode = mergeBSTsIntoSingleBST.canMerge(trees);

        assertEquals(10, treeNode.val);
    }

    @Test
    void canMergeV6() {
        TreeNode root1 = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);

        TreeNode root3 = new TreeNode(4);
        root3.left = new TreeNode(2);

        TreeNode root4 = new TreeNode(1);
        root4.right = new TreeNode(4);

        MergeBSTsIntoSingleBST mergeBSTsIntoSingleBST = new MergeBSTsIntoSingleBST();

        List<TreeNode> trees = new ArrayList<>();
        trees.add(root1);
        trees.add(root2);
        trees.add(root3);
        trees.add(root4);

        TreeNode treeNode = mergeBSTsIntoSingleBST.canMerge(trees);

        assertEquals(5, treeNode.val);
    }

    @Test
    void canMergeV7() {
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(1);

        TreeNode root3 = new TreeNode(4);
        root3.left = new TreeNode(2);

        MergeBSTsIntoSingleBST mergeBSTsIntoSingleBST = new MergeBSTsIntoSingleBST();

        List<TreeNode> trees = new ArrayList<>();
        trees.add(root1);
        trees.add(root2);
        trees.add(root3);

        TreeNode treeNode = mergeBSTsIntoSingleBST.canMerge(trees);

        assertNull(treeNode);
    }
}