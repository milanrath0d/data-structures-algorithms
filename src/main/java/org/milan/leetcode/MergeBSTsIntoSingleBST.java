package org.milan.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Refer {@link @https://leetcode.com/problems/merge-bsts-to-create-single-bst/}
 * <p>
 * TODO understand this
 *
 * @author Milan Rathod
 */
public class MergeBSTsIntoSingleBST {

    public TreeNode canMerge(List<TreeNode> trees) {

        if (trees.size() == 1) {
            return trees.get(0);
        }

        //Store leaf node to parentNode list
        Map<Integer, List<TreeNode>> leaf = new HashMap<>();

        //ParentMap to store parent of each root val
        Map<Integer, TreeNode> parentMap = new HashMap<>();

        int val = -1;

        for (TreeNode tree : trees) {
            if (tree.left != null) {
                leaf.putIfAbsent(tree.left.val, new ArrayList<>());
                leaf.get(tree.left.val).add(tree);
            }
            if (tree.right != null) {
                leaf.putIfAbsent(tree.right.val, new ArrayList<>());
                leaf.get(tree.right.val).add(tree);
            }
            parentMap.put(tree.val, tree);
            val = tree.val;
        }

        // Keeps track of number of BST roots without being in any of leaf
        int count = 0;

        for (TreeNode t : trees) {
            if (!leaf.containsKey(t.val)) {
                count++;
            } else {
                // Find
                for (TreeNode parent : leaf.get(t.val)) {
                    //Check if adding t to current parent results in valid BST
                    if (parent.left != null && parent.left.val == t.val
                        && (t.left == null || t.left.val < parent.val)
                        && (t.right == null || t.right.val < parent.val)) {
                        parent.left = t;
                    } else if (parent.right != null && parent.right.val == t.val
                        && (t.left == null || t.left.val > parent.val)
                        && (t.right == null || t.right.val > parent.val)) {
                        parent.right = t;
                    } else continue;
                    //Get the parent - Union
                    parentMap.put(t.val, getParent(parent.val, parentMap));
                }
                if (parentMap.get(t.val) == t) count++;
            }
        }

        if (count > 1) return null;
        //Check if return BST is valid, this handles special case where child tries to set parent as child
        if (isValidBST(parentMap.get(val), null, null))
            return parentMap.get(val);
        return null;

    }

    private TreeNode getParent(int val, Map<Integer, TreeNode> parentMap) {
        if (val == parentMap.get(val).val) return parentMap.get(val);

        return getParent(parentMap.get(val).val, parentMap);
    }

    private boolean isValidBST(TreeNode root, TreeNode left, TreeNode right) {
        // Empty tree is BST
        if (root == null)
            return true;

        // If left node exist then it's data should be less than root's data
        if (left != null && root.val <= left.val) {
            return false;
        }

        // If right node exist then it's data should be less than root's data
        if (right != null && root.val >= right.val) {
            return false;
        }

        // Check the left and right subtree recursively
        return (isValidBST(root.left, left, root) && isValidBST(root.right, root, right));
    }

}
